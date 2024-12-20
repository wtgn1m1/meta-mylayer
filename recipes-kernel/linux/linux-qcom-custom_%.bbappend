FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://devtool-fragment.cfg \
            file://0001-unitree-net-okay.patch \
            file://0002-unitree-es7210-okay.patch \
            file://0003-unitree-bt-okay.patch \
            file://0004-unitree-gemini-okay.patch \
            file://0005-unitree-usb-wifi-ok.patch \
            file://0001-unitree-m117b-okay.patch \
            file://0001-unitree-add-mt76x2U.patch \
            "

