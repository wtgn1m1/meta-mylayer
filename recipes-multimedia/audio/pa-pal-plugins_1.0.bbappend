FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://qcs9100-ridesx-snd-card.conf"

do_install:append() {
    install -d ${D}/etc/
    install -m 0644 ${WORKDIR}/qcs9100-ridesx-snd-card.conf ${D}/etc/qcs9100-ridesx-snd-card.conf
}