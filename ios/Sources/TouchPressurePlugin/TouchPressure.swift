import Foundation

@objc public class TouchPressure: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
