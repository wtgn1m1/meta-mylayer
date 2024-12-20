SUMMARY = "Library for Livox"
HOMEPAGE = "https://github.com/Livox-SDK/Livox-SDK2"
SECTION = "libs"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://3rdparty/FastCRC/LICENSE.md;md5=5234a3568b2b14a4697d4084dce10017"

SRC_URI = "file://liblivoxsdk2_1.2.4.tar.gz"

# Modify these as desired
# PV = "1.0+git${SRCPV}"
# SRCREV = "dc361aa904ca8376ab7084c6e7c05046f7316bbf"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
# EXTRA_OECMAKE = ""

FILES:${PN} += "${libdir}/*.so"
FILES:${PN}-dbg += "${libdir}/*.debug"

FILES_SOLIBSDEV = ""

INSANE_SKIP:${PN} += "installed-vs-shipped"
INSANE_SKIP:${PN} += "dev-so"

BBCLASSEXTEND = "native nativesdk"

