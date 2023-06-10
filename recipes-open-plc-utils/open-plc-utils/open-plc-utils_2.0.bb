DESCRIPTION = "Open PLC Utilities"
SECTION = "utils"
LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d83a9e9a9788beb9357262af385f6c7"

SRC_URI = "git://github.com/qca/open-plc-utils.git;protocol=https"
SRCREV = "1ba7d5a042e4e8ff6858b08e113eec5dc4e89cf2"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "CC="${CC}""
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	oe_runmake ROOTFS=${S}
}

do_install() {
	oe_runmake install ROOTFS=${D}
}

FILES:${PN} = "/usr/local/bin/*"
