# Copyright (C) 2019, Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

MAJ_VER = "${@oe.utils.trim_version("${PV}", 3)}"
PATCHPATH = "${CURDIR}/${PN}_${MAJ_VER}"
inherit auto-patch

PACKAGECONFIG ??= "use-egl use-linux-v4l2 component-build proprietary-codecs"

GN_ARGS += "is_debug=true is_official_build=false"

# GN_ARGS += " \
# 	use_system_minigbm=false \
# 	use_rockchip_minigbm=true \
# 	use_wayland_gbm=false \
# "
