DESCRIPTION = "wifi firmware"
PR = "r0"
LICENSE = "GPLv2"    

LIC_FILES_CHKSUM = "file://mt7662.bin;md5=d6d99be5b884d21457340dec16655d1e"
SRC_URI += "file://mt7662.bin \
            file://mt7662_rom_patch.bin"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/lib/firmware/
    install -m 0644 ${WORKDIR}/mt7662.bin ${D}/lib/firmware/
    install -m 0644 ${WORKDIR}/mt7662_rom_patch.bin ${D}/lib/firmware/
}
    
FILES:${PN} += "/lib/firmware/*.bin"
# FILES:${PN}-dbg += "${nonarch_base_libdir}/firmware/*.debug"

# FILES_SOLIBSDEV = ""

# INSANE_SKIP:${PN} += "installed-vs-shipped"
# INSANE_SKIP:${PN} += "dev-so"