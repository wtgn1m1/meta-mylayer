# robot ip
do_install:append:qcom () {
    echo "" >> ${D}${sysconfdir}/dhcpcd.conf
    echo "interface eth0" >> ${D}${sysconfdir}/dhcpcd.conf
    echo "static ip_address=192.168.123.171/24" >> ${D}${sysconfdir}/dhcpcd.conf
    echo "static routers=192.168.123.1" >> ${D}${sysconfdir}/dhcpcd.conf
    echo "static domain_name_servers=114.114.114.114 192.168.123.1" >> ${D}${sysconfdir}/dhcpcd.conf
}
