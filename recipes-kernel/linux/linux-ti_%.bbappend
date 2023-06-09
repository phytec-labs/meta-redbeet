DESCRIPTION = "Includes a Device Tree Overlay for the AM62 Phyboard Lyra that allows communication to the RED beet CB"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://0001-arm64-dts-ti-k3-am62-phyboard-lyra-redbeet-Overlay.patch"
