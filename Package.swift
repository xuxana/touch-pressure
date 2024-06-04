// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "TouchPressure",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "TouchPressure",
            targets: ["TouchPressurePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "TouchPressurePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/TouchPressurePlugin"),
        .testTarget(
            name: "TouchPressurePluginTests",
            dependencies: ["TouchPressurePlugin"],
            path: "ios/Tests/TouchPressurePluginTests")
    ]
)