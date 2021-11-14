# Copyright (C) 2020, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

inherit auto-patch

inherit freeze-rev local-git

SRCREV = "106d1430c1474c8d6b63b18fdb7e695e00bba191"
SRC_URI = " \
	git://github.com/JeffyCN/mirrors.git;protocol=https;nobranch=1;branch=kernel-4.19-2021_10_13; \
"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
