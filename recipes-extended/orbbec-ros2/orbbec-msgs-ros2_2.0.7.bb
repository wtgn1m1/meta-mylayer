inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The rplidar ros package, support rplidar A2/A1 and A3/S1"
AUTHOR = "<ros@slamtec.com>"
ROS_AUTHOR = "Slamtec ROS Maintainer <ros@slamtec.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

ROS_BPN = "orbbec_camera_msgs"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    ament-cmake-ros-native \
    pkgconfig-native \
    rosidl-adapter-native \
    python3-numpy-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-generator-py-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-cpp-native \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
    rosidl-typesupport-interface-native \
    rosidl-typesupport-introspection-c-native \
    rosidl-typesupport-introspection-cpp-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# ROS_BRANCH ?= "branch=master"
# SRC_URI = "git://github.com/Livox-SDK/livox_ros_driver2;${ROS_BRANCH};protocol=https"
# SRCREV = "b6ff7d1c8b210a96b74e919823771e1e32249758"
SRC_URI = "file://orbbec_camera_msgs.tar.gz"
S = "${WORKDIR}/orbbec_camera_msgs"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
