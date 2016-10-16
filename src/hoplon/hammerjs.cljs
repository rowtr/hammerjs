(ns hoplon.hammerjs
  (:require
    [cljsjs.hammer]
    [hoplon.core :as h]))


(comment
(defn- pd [f] #(doto % (.. -gesture preventDefault) f))

(defmethod h/on! :hold           [e _ f] (.. (js/Hammer e) (on "hold"           (pd f))))
(defmethod h/on! :tap            [e _ f] (.. (js/Hammer e) (on "tap"            (pd f))))
(defmethod h/on! :doubletap      [e _ f] (.. (js/Hammer e) (on "doubletap"      (pd f))))
(defmethod h/on! :drag           [e _ f] (.. (js/Hammer e) (on "drag"           (pd f))))
(defmethod h/on! :dragstart      [e _ f] (.. (js/Hammer e) (on "dragstart"      (pd f))))
(defmethod h/on! :dragend        [e _ f] (.. (js/Hammer e) (on "dragend"        (pd f))))
(defmethod h/on! :dragup         [e _ f] (.. (js/Hammer e) (on "dragup"         (pd f))))
(defmethod h/on! :dragdown       [e _ f] (.. (js/Hammer e) (on "dragdown"       (pd f))))
(defmethod h/on! :dragleft       [e _ f] (.. (js/Hammer e) (on "dragleft"       (pd f))))
(defmethod h/on! :dragright      [e _ f] (.. (js/Hammer e) (on "dragright"      (pd f))))
(defmethod h/on! :swipe          [e _ f] (.. (js/Hammer e) (on "swipe"          (pd f))))
(defmethod h/on! :swipeup        [e _ f] (.. (js/Hammer e) (on "swipeup"        (pd f))))
(defmethod h/on! :swipedown      [e _ f] (.. (js/Hammer e) (on "swipedown"      (pd f))))
(defmethod h/on! :swipeleft      [e _ f] (.. (js/Hammer e) (on "swipeleft"      (pd f))))
(defmethod h/on! :swiperight     [e _ f] (.. (js/Hammer e) (on "swiperight"     (pd f))))
(defmethod h/on! :transform      [e _ f] (.. (js/Hammer e) (on "transform"      (pd f))))
(defmethod h/on! :transformstart [e _ f] (.. (js/Hammer e) (on "transformstart" (pd f))))
(defmethod h/on! :transformend   [e _ f] (.. (js/Hammer e) (on "transformend"   (pd f))))
(defmethod h/on! :rotate         [e _ f] (.. (js/Hammer e) (on "rotate"         (pd f))))
(defmethod h/on! :pinch          [e _ f] (.. (js/Hammer e) (on "pinch"          (pd f))))
(defmethod h/on! :pinchin        [e _ f] (.. (js/Hammer e) (on "pinchin"        (pd f))))
(defmethod h/on! :pinchout       [e _ f] (.. (js/Hammer e) (on "pinchout"       (pd f))))
(defmethod h/on! :touch          [e _ f] (.. (js/Hammer e) (on "touch"          (pd f))))
(defmethod h/on! :release        [e _ f] (.. (js/Hammer e) (on "release"        (pd f))))

)

(defmethod h/on! :tap            [e k f] (.. (js/Hammer e) (on "tap"            #(f))))
(defmethod h/on! :swiperight     [e k f] (.. (js/Hammer e) (on "swiperight"     #(f))))
(defmethod h/on! :swipeleft      [e k f] (.. (js/Hammer e) (on "swipeleft"      #(f))))
(defmethod h/on! :touch          [e _ f] (.. (js/Hammer e) (on "touch"          #(f))))
(defmethod h/on! :pan            [e _ f] (.. (js/Hammer e) (on "pan"            #(f))))
(defmethod h/on! :panright       [e _ f] (.. (js/Hammer e) (on "panright"       #(f))))
(defmethod h/on! :panleft        [e _ f] (.. (js/Hammer e) (on "panleft"        #(f %1))))
(defmethod h/on! :swipe          [e k f] (let [r (js/Hammer.Swipe.)
                                               h (js/Hammer.Manager. e)]
                                           (.add h r)
                                           (.on h "swipe" #(f %1))))
