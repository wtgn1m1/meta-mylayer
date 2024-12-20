DESCRIPTION = "unitree sdk"
PR = "r0"
LICENSE = "BSD 3-Clause"    

LIC_FILES_CHKSUM = "file://unitree.conf;md5=38dc202477601538743be4b8e2a062a8"
SRC_URI += "file://unitree_sdk.tar.gz file://unitree.conf"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/etc/ld.so.conf.d/
    install -m 0644 ${WORKDIR}/unitree.conf ${D}/etc/ld.so.conf.d/unitree.conf

    install -d ${D}/unitree/

    install -d ${D}/unitree/lib/
    install -m 0644 ${S}/unitree/lib/libddsc.so ${D}/unitree/lib/libddsc.so
    install -m 0644 ${S}/unitree/lib/libddscxx.so ${D}/unitree/lib/libddscxx.so

    cd ${D}/unitree/lib/
    ln -sf libddsc.so libddsc.so.0
    ln -sf libddscxx.so libddscxx.so.0 

    install -d ${D}/unitree/example
    install -m 0554 ${S}/unitree/example/advanced_gamepad ${D}/unitree/example/advanced_gamepad
    install -m 0554 ${S}/unitree/example/g1_loco_client ${D}/unitree/example/g1_loco_client
    install -m 0554 ${S}/unitree/example/g1_ankle_swing_example ${D}/unitree/example/g1_ankle_swing_example
    install -m 0554 ${S}/unitree/example/g1_arm5_sdk_dds_example ${D}/unitree/example/g1_arm5_sdk_dds_example
    install -m 0554 ${S}/unitree/example/g1_arm7_sdk_dds_example ${D}/unitree/example/g1_arm7_sdk_dds_example
}
    
FILES:${PN} += "/etc/ld.so.conf.d/*.conf"
FILES:${PN} += "/unitree/*"

FILES_SOLIBSDEV = ""

INSANE_SKIP:${PN} += "installed-vs-shipped"
INSANE_SKIP:${PN} += "dev-so"