//
//  AppDelegate.swift
//  WeightedGAPP
//
//  Created by 장준우 on 2016. 12. 9..
//  Copyright © 2016년 Joonwoo Percy Jang. All rights reserved.
//

import Cocoa

@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate {

    @IBOutlet weak var window: NSWindow!
  
    
    @IBOutlet weak var weightOne: NSTextField!
    @IBOutlet weak var weightTwo: NSTextField!
    @IBOutlet weak var weightThree: NSTextField!
    @IBOutlet weak var weightFour: NSTextField!
    @IBOutlet weak var weightFive: NSTextField!
    
    @IBOutlet weak var gradeOne: NSTextField!
    @IBOutlet weak var gradeTwo: NSTextField!
    @IBOutlet weak var gradeThree: NSTextField!
    @IBOutlet weak var gradeFour: NSTextField!
    @IBOutlet weak var gradeFive: NSTextField!
    
    @IBOutlet weak var resultLabel: NSTextField!
    
    @IBAction func buttonPressed(_ sender: Any) {
       // let result : Double = calculateGrade()
        var w1S: String = weightOne.stringValue
        var w1D : Double = (w1S as NSString).doubleValue
        
        var w2S: String = weightTwo.stringValue
        var w2D : Double = (w2S as NSString).doubleValue
        
        var w3S: String = weightThree.stringValue
        var w3D : Double = (w3S as NSString).doubleValue
        
        var w4S: String = weightFour.stringValue
        var w4D : Double = (w4S as NSString).doubleValue
        
        var w5S: String = weightFive.stringValue
        var w5D : Double = (w5S as NSString).doubleValue
        
        //Compute in Grades
        var g1S: String = gradeOne.stringValue
        var g1D : Double = (g1S as NSString).doubleValue
        
        var g2S: String = gradeTwo.stringValue
        var g2D : Double = (g2S as NSString).doubleValue
        
        var g3S: String = gradeThree.stringValue
        var g3D : Double = (g3S as NSString).doubleValue
        
        var g4S: String = gradeFour.stringValue
        var g4D : Double = (g4S as NSString).doubleValue
        
        var g5S: String = gradeFive.stringValue
        var g5D : Double = (g5S as NSString).doubleValue
        
        let finalGrade : Double = (w1D*(g1D/100))+(w2D*(g2D/100))+(w3D*(g3D/100))+(w4D*(g4D/100))+(w5D*(g5D/100))
        
        
        
        
        var gg: String
        if(w1D == 0 || w2D == 0 || w3D == 0 || w4D == 0 || w5D == 0 || g1D == 0 || g2D == 0 || g3D == 0 || g4D == 0 || g5D == 0){
            self.resultLabel.stringValue = "Enter Valid Numbers!"
        }
        
        else if(w1D+w2D+w3D+w4D+w5D != 100){
            self.resultLabel.stringValue = "Make sure weight sums up to 100!"
        }
        
        else{
        gg =  String(format: "%.2f", finalGrade)
        self.resultLabel.stringValue =  "Weighted Grade: " + gg + "%"
        }
    }
    

    func applicationDidFinishLaunching(_ aNotification: Notification) {
        // Insert code here to initialize your application
    }

    func applicationWillTerminate(_ aNotification: Notification) {
        // Insert code here to tear down your application
    }


}

