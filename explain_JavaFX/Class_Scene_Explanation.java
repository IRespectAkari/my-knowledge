Scene クラスの説明

インポート方法
import javafx.scene.Scene;

コンストラクタ<コンストラクタ名 説明>
Scene(Parent root)// 特定のルート・ノードのシーンを作成します。
Scene(Parent root, double width, double height)// 指定されたサイズを使用した特定のルート・ノードのシーンを作成します。
Scene(Parent root, double width, double height, boolean depthBuffer)// 幅と高さの寸法を使用したルートで構成されるシーンを構築し、奥行きのバッファをこのシーンに作成するかどうかを指定します。
Scene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing)// 幅と高さの寸法を使用したルートで構成されるシーンを構築し、奥行きのバッファをこのシーンに作成するかどうかを指定し、シーンのアンチエイリアスをリクエストするかどうかを指定します。
Scene(Parent root, double width, double height, Paint fill)// 指定されたサイズおよび塗りつぶしの特定のルート・ノードのシーンを作成します。
Scene(Parent root, Paint fill)// 塗りつぶしを使用した特定のルート・ノードのシーンを作成します。

プロパティ<型 変数名 説明>
 - ObjectProperty<Camera> camera// このSceneをレンダリングするために使用するカメラのタイプを指定します。
 - ObjectProperty<Cursor> cursor// このSceneのマウス・カーソルを定義します。
 - ReadOnlyObjectProperty<NodeOrientation> effectiveNodeOrientation// シーンのノードの有効な向きは、ノードの向きの継承を解決して、左から右または右から左を返します。
 - ObjectProperty<EventDispatcher> eventDispatcher// このシーンのイベント・ディスパッチャを指定します。
 - ObjectProperty<Paint> fill// このSceneの背景の塗りつぶしを定義します。
 - ReadOnlyObjectProperty<Node> focusOwner// シーンの現在のフォーカス所有者ノード。
 - ReadOnlyDoubleProperty height// このSceneの高さ
 - ObjectProperty<NodeOrientation> nodeOrientation// NodeOrientationを保持するプロパティ。
 - ObjectProperty<EventHandler<? super ContextMenuEvent>> onContextMenuRequested// このSceneでマウス・ボタンがクリックされた(押されて放された)ときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onDragDetected// ドラッグ・ジェスチャが検出されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super DragEvent>> onDragDone// データがドロップ・ターゲットにドロップされた後に、この@{code Scene}がドラッグ・アンド・ドロップ・ジェスチャのソースである場合に呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super DragEvent>> onDragDropped// ドラッグ・アンド・ドロップ・ジェスチャの間にこのSceneでマウス・ボタンが放されると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super DragEvent>> onDragEntered// ドラッグ・ジェスチャがこのSceneに入ると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super DragEvent>> onDragExited// ドラッグ・ジェスチャがこのSceneから出ると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super DragEvent>> onDragOver// このScene内でドラッグ・ジェスチャが進行しているときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super InputMethodEvent>> onInputMethodTextChanged// このNodeに入力フォーカスがあり、入力メソッドのテキストが変更されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super KeyEvent>> onKeyPressed// このSceneのNodeに入力フォーカスがあり、キーが入力されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super KeyEvent>> onKeyReleased// このSceneのNodeに入力フォーカスがあり、キーが放されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super KeyEvent>> onKeyTyped// このSceneのNodeに入力フォーカスがあり、キーが入力されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseClicked// このSceneでマウス・ボタンがクリックされた(押されて放された)ときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseDragEvent>> onMouseDragEntered// 押下、ドラッグ、解放のジェスチャがすべてこのSceneに入ると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseDragEvent>> onMouseDragExited// 押下、ドラッグ、解放のジェスチャがすべてこのSceneから出ると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseDragged// このSceneでマウス・ボタンが押されてからドラッグされるときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseDragEvent>> onMouseDragOver// 押下、ドラッグ、解放のジェスチャがすべてこのScene内で進行しているときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseDragEvent>> onMouseDragReleased// 押下、ドラッグ、解放のジェスチャがすべてこのScene内で(マウス・ボタンを放すことにより)終了すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseEntered// マウスがこのSceneに入るときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseExited// マウスがこのSceneから出るときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseMoved// このScene内をマウス・カーソルが移動するが、ボタンが押されなかった場合に呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMousePressed// このSceneでマウス・ボタンが押されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super MouseEvent>> onMouseReleased// このSceneでマウス・ボタンが放されたときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super RotateEvent>> onRotate// 回転アクションをユーザーが実行すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super RotateEvent>> onRotationFinished// 回転ジェスチャが終了すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super RotateEvent>> onRotationStarted// 回転ジェスチャが検出されると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ScrollEvent>> onScrollFinished// スクロール・ジェスチャが終了すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ScrollEvent>> onScroll// スクロール・アクションをユーザーが実行すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ScrollEvent>> onScrollStarted// スクロール・ジェスチャが検出されると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super SwipeEvent>> onSwipeDown// このシーンを中心にした下向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super SwipeEvent>> onSwipeLeft// このシーンを中心にした左向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super SwipeEvent>> onSwipeRight// このシーンを中心にした右向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super SwipeEvent>> onSwipeUp// このシーンを中心にした上向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super TouchEvent>> onTouchMoved// タッチ・ポイントが移動すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super TouchEvent>> onTouchPressed// 新しいタッチ・ポイントが押されると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super TouchEvent>> onTouchReleased// 新しいタッチ・ポイントが押されると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super TouchEvent>> onTouchStationary// タッチ・ポイントが押されたまま静止しているときに呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ZoomEvent>> onZoomFinished// ズーム・ジェスチャが終了すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ZoomEvent>> onZoom// ズーム・アクションをユーザーが実行すると呼び出される関数を定義します。
 - ObjectProperty<EventHandler<? super ZoomEvent>> onZoomStarted// ズーム・ジェスチャが検出されると呼び出される関数を定義します。
 - ObjectProperty<Parent> root// シーン・グラフのルートNodeを定義します。
 - ObjectProperty<String> userAgentStylesheet
 - ReadOnlyDoubleProperty width// このSceneの幅
 - ReadOnlyObjectProperty<Window> window// このSceneのWindow
 - ReadOnlyDoubleProperty x// WindowのこのSceneの水平位置。
 - ReadOnlyDoubleProperty y// WindowのこのSceneの垂直位置。

メソッド<メソッド名 返り値 説明>
 + addEventFilter(EventType<T> eventType, EventHandler<? super T> eventFilter) : <T extends Event> void// このシーンにイベ<T extends Event>ント・フィルタを登録します。
 + addEventHandler(EventType<T> eventType, EventHandler<? super T> eventHandler) : <T extends Event> void// このシーンにイベント・ハンドラを登録します。
 + addMnemonic(Mnemonic m) : void// 指定されたニーモニックを登録します。
 + buildEventDispatchChain(EventDispatchChain tail) : EventDispatchChain// このシーンのイベント・ディスパッチ・チェーンを構築します。
 + cameraProperty() : ObjectProperty<Camera>// このSceneをレンダリングするために使用するカメラのタイプを指定します。
 + cursorProperty() : ObjectProperty<Cursor>// このSceneのマウス・カーソルを定義します。
 + effectiveNodeOrientationProperty() : ReadOnlyObjectProperty<NodeOrientation>// シーンのノードの有効な向きは、ノードの向きの継承を解決して、左から右または右から左を返します。
 + eventDispatcherProperty() : ObjectProperty<EventDispatcher>// このシーンのイベント・ディスパッチャを指定します。
 + fillProperty() : ObjectProperty<Paint>// このSceneの背景の塗りつぶしを定義します。
 + focusOwnerProperty() : ReadOnlyObjectProperty<Node>// シーンの現在のフォーカス所有者ノード。
 + getAccelerators() : ObservableMap<KeyCombination,Runnable>// このSceneのアクセラレータのリストを取得します。
 + getAntiAliasing() : SceneAntialiasing// このSceneの定義済SceneAntialiasingを戻します。
 + getCamera() : Camera// プロパティcameraの値を取得します。
 + getCursor() : Cursor// プロパティcursorの値を取得します。
 + getEffectiveNodeOrientation() : NodeOrientation// プロパティeffectiveNodeOrientationの値を取得します。
 + getEventDispatcher() : EventDispatcher// プロパティeventDispatcherの値を取得します。
 + getFill() : Paint// プロパティfillの値を取得します。
 + getFocusOwner() : Node// プロパティfocusOwnerの値を取得します。
 + getHeight() : double// プロパティheightの値を取得します。
 + getMnemonics() : ObservableMap<KeyCombination,ObservableList<Mnemonic>>// このSceneのニーモニックのリストを取得します。
 + getNodeOrientation() : NodeOrientation// プロパティnodeOrientationの値を取得します。
 + getOnContextMenuRequested() : EventHandler<? super ContextMenuEvent>// プロパティonContextMenuRequestedの値を取得します。
 + getOnDragDetected() : EventHandler<? super MouseEvent>// プロパティonDragDetectedの値を取得します。
 + getOnDragDone() : EventHandler<? super DragEvent>// プロパティonDragDoneの値を取得します。
 + getOnDragDropped() : EventHandler<? super DragEvent>// プロパティonDragDroppedの値を取得します。
 + getOnDragEntered() : EventHandler<? super DragEvent>// プロパティonDragEnteredの値を取得します。
 + getOnDragExited() : EventHandler<? super DragEvent>// プロパティonDragExitedの値を取得します。
 + getOnDragOver() : EventHandler<? super DragEvent>// プロパティonDragOverの値を取得します。
 + getOnInputMethodTextChanged() : EventHandler<? super InputMethodEvent>// プロパティonInputMethodTextChangedの値を取得します。
 + getOnKeyPressed() : EventHandler<? super KeyEvent>// プロパティonKeyPressedの値を取得します。
 + getOnKeyReleased() : EventHandler<? super KeyEvent>// プロパティonKeyReleasedの値を取得します。
 + getOnKeyTyped() : EventHandler<? super KeyEvent>// プロパティonKeyTypedの値を取得します。
 + getOnMouseClicked() : EventHandler<? super MouseEvent>// プロパティonMouseClickedの値を取得します。
 + getOnMouseDragEntered() : EventHandler<? super MouseDragEvent>// プロパティonMouseDragEnteredの値を取得します。
 + getOnMouseDragExited() : EventHandler<? super MouseDragEvent>// プロパティonMouseDragExitedの値を取得します。
 + getOnMouseDragged() : EventHandler<? super MouseEvent>// プロパティonMouseDraggedの値を取得します。
 + getOnMouseDragOver() : EventHandler<? super MouseDragEvent>// プロパティonMouseDragOverの値を取得します。
 + getOnMouseDragReleased() : EventHandler<? super MouseDragEvent>// プロパティonMouseDragReleasedの値を取得します。
 + getOnMouseEntered() : EventHandler<? super MouseEvent>// プロパティonMouseEnteredの値を取得します。
 + getOnMouseExited() : EventHandler<? super MouseEvent>// プロパティonMouseExitedの値を取得します。
 + getOnMouseMoved() : EventHandler<? super MouseEvent>// プロパティonMouseMovedの値を取得します。
 + getOnMousePressed() : EventHandler<? super MouseEvent>// プロパティonMousePressedの値を取得します。
 + getOnMouseReleased() : EventHandler<? super MouseEvent>// プロパティonMouseReleasedの値を取得します。
 + getOnRotate() : EventHandler<? super RotateEvent>// プロパティonRotateの値を取得します。
 + getOnRotationFinished() : EventHandler<? super RotateEvent>// プロパティonRotationFinishedの値を取得します。
 + getOnRotationStarted() : EventHandler<? super RotateEvent>// プロパティonRotationStartedの値を取得します。
 + getOnScroll() : EventHandler<? super ScrollEvent>// プロパティonScrollの値を取得します。
 + getOnScrollFinished() : EventHandler<? super ScrollEvent>// プロパティonScrollFinishedの値を取得します。
 + getOnScrollStarted() : EventHandler<? super ScrollEvent>// プロパティonScrollStartedの値を取得します。
 + getOnSwipeDown() : EventHandler<? super SwipeEvent>// プロパティonSwipeDownの値を取得します。
 + getOnSwipeLeft() : EventHandler<? super SwipeEvent>// プロパティonSwipeLeftの値を取得します。
 + getOnSwipeRight() : EventHandler<? super SwipeEvent>// プロパティonSwipeRightの値を取得します。
 + getOnSwipeUp() : EventHandler<? super SwipeEvent>// プロパティonSwipeUpの値を取得します。
 + getOnTouchMoved() : EventHandler<? super TouchEvent>// プロパティonTouchMovedの値を取得します。
 + getOnTouchPressed() : EventHandler<? super TouchEvent>// プロパティonTouchPressedの値を取得します。
 + getOnTouchReleased() : EventHandler<? super TouchEvent>// プロパティonTouchReleasedの値を取得します。
 + getOnTouchStationary() : EventHandler<? super TouchEvent>// プロパティonTouchStationaryの値を取得します。
 + getOnZoom() : EventHandler<? super ZoomEvent>// プロパティonZoomの値を取得します。
 + getOnZoomFinished() : EventHandler<? super ZoomEvent>// プロパティonZoomFinishedの値を取得します。
 + getOnZoomStarted() : EventHandler<? super ZoomEvent>// プロパティonZoomStartedの値を取得します。
 + getProperties() : ObservableMap<Object,Object>// アプリケーション開発者が主に使用するこのノードのプロパティの監視可能なマップを返します。
 + getRoot() : Parent// プロパティrootの値を取得します。
 + getStylesheets() : ObservableList<String>// このシーンのコンテンツで使用するスタイルシートにリンクしている文字列URLの監視可能リストを取得します。
 + getUserAgentStylesheet() : String// このSceneで使用されるuser-agentスタイルシートのURLを取得します。
 + getUserData() : Object// 以前に設定したObjectプロパティを返すか、またはsetUserData(java.lang.Object)メソッドを使用してこのようなプロパティを設定していない場合にはnullを返します。
 + getWidth() : double// プロパティwidthの値を取得します。
 + getWindow() : Window// プロパティwindowの値を取得します。
 + getX() : double// プロパティxの値を取得します。
 + getY() : double// プロパティyの値を取得します。
 + hasProperties() : boolean// Sceneにプロパティがあるかどうかをテストします。
 + heightProperty() : ReadOnlyDoubleProperty// このSceneの高さ
 + isDepthBuffer() : boolean// このシーンの奥行きのバッファの属性を取得します。
 + lookup(String selector) : Node// 指定されたCSSセレクタに基づいて、シーングラフ内の任意のノードを検索します。
 + nodeOrientationProperty() : ObjectProperty<NodeOrientation>// NodeOrientationを保持するプロパティ。
 + onContextMenuRequestedProperty() : ObjectProperty<EventHandler<? super ContextMenuEvent>>// このSceneでマウス・ボタンがクリックされた(押されて放された)ときに呼び出される関数を定義します。
 + onDragDetectedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// ドラッグ・ジェスチャが検出されたときに呼び出される関数を定義します。
 + onDragDoneProperty() : ObjectProperty<EventHandler<? super DragEvent>>// データがドロップ・ターゲットにドロップされた後に、この@{code Scene}がドラッグ・アンド・ドロップ・ジェスチャのソースである場合に呼び出される関数を定義します。//  + onDragDroppedProperty() : ObjectProperty<EventHandler<? super DragEvent>>// ドラッグ・アンド・ドロップ・ジェスチャの間にこのSceneでマウス・ボタンが放されると呼び出される関数を定義します。
 + onDragEnteredProperty() : ObjectProperty<EventHandler<? super DragEvent>>// ドラッグ・ジェスチャがこのSceneに入ると呼び出される関数を定義します。
 + onDragExitedProperty() : ObjectProperty<EventHandler<? super DragEvent>>// ドラッグ・ジェスチャがこのSceneから出ると呼び出される関数を定義します。
 + onDragOverProperty() : ObjectProperty<EventHandler<? super DragEvent>>// このScene内でドラッグ・ジェスチャが進行しているときに呼び出される関数を定義します。
 + onInputMethodTextChangedProperty() : ObjectProperty<EventHandler<? super InputMethodEvent>>// このNodeに入力フォーカスがあり、入力メソッドのテキストが変更されたときに呼び出される関数を定義します。
 + onKeyPressedProperty() : ObjectProperty<EventHandler<? super KeyEvent>>// このSceneのNodeに入力フォーカスがあり、キーが入力されたときに呼び出される関数を定義します。
 + onKeyReleasedProperty() : ObjectProperty<EventHandler<? super KeyEvent>>// このSceneのNodeに入力フォーカスがあり、キーが放されたときに呼び出される関数を定義します。
 + onKeyTypedProperty() : ObjectProperty<EventHandler<? super KeyEvent>>// このSceneのNodeに入力フォーカスがあり、キーが入力されたときに呼び出される関数を定義します。
 + onMouseClickedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// このSceneでマウス・ボタンがクリックされた(押されて放された)ときに呼び出される関数を定義します。
 + onMouseDragEnteredProperty() : ObjectProperty<EventHandler<? super MouseDragEvent>>// 押下、ドラッグ、解放のジェスチャがすべてこのSceneに入ると呼び出される関数を定義します。
 + onMouseDragExitedProperty() : ObjectProperty<EventHandler<? super MouseDragEvent>>// 押下、ドラッグ、解放のジェスチャがすべてこのSceneから出ると呼び出される関数を定義します。
 + onMouseDraggedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// このSceneでマウス・ボタンが押されてからドラッグされるときに呼び出される関数を定義します。
 + onMouseDragOverProperty() : ObjectProperty<EventHandler<? super MouseDragEvent>>// 押下、ドラッグ、解放のジェスチャがすべてこのScene内で進行しているときに呼び出される関数を定義します。
 + onMouseDragReleasedProperty() : ObjectProperty<EventHandler<? super MouseDragEvent>>// 押下、ドラッグ、解放のジェスチャがすべてこのScene内で(マウス・ボタンを放すことにより)終了すると呼び出される関数を定義します。
 + onMouseEnteredProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// マウスがこのSceneに入るときに呼び出される関数を定義します。
 + onMouseExitedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// マウスがこのSceneから出るときに呼び出される関数を定義します。
 + onMouseMovedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// このScene内をマウス・カーソルが移動するが、ボタンが押されなかった場合に呼び出される関数を定義します。
 + onMousePressedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// このSceneでマウス・ボタンが押されたときに呼び出される関数を定義します。
 + onMouseReleasedProperty() : ObjectProperty<EventHandler<? super MouseEvent>>// このSceneでマウス・ボタンが放されたときに呼び出される関数を定義します。
 + onRotateProperty() : ObjectProperty<EventHandler<? super RotateEvent>>// 回転アクションをユーザーが実行すると呼び出される関数を定義します。
 + onRotationFinishedProperty() : ObjectProperty<EventHandler<? super RotateEvent>>// 回転ジェスチャが終了すると呼び出される関数を定義します。
 + onRotationStartedProperty() : ObjectProperty<EventHandler<? super RotateEvent>>// 回転ジェスチャが検出されると呼び出される関数を定義します。
 + onScrollFinishedProperty() : ObjectProperty<EventHandler<? super ScrollEvent>>// スクロール・ジェスチャが終了すると呼び出される関数を定義します。
 + onScrollProperty() : ObjectProperty<EventHandler<? super ScrollEvent>>// スクロール・アクションをユーザーが実行すると呼び出される関数を定義します。
 + onScrollStartedProperty() : ObjectProperty<EventHandler<? super ScrollEvent>>// スクロール・ジェスチャが検出されると呼び出される関数を定義します。
 + onSwipeDownProperty() : ObjectProperty<EventHandler<? super SwipeEvent>>// このシーンを中心にした下向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 + onSwipeLeftProperty() : ObjectProperty<EventHandler<? super SwipeEvent>>// このシーンを中心にした左向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 + onSwipeRightProperty() : ObjectProperty<EventHandler<? super SwipeEvent>>// このシーンを中心にした右向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 + onSwipeUpProperty() : ObjectProperty<EventHandler<? super SwipeEvent>>// このシーンを中心にした上向きのスワイプ・ジェスチャが発生すると呼び出される関数を定義します。
 + onTouchMovedProperty() : ObjectProperty<EventHandler<? super TouchEvent>>// タッチ・ポイントが移動すると呼び出される関数を定義します。
 + onTouchPressedProperty() : ObjectProperty<EventHandler<? super TouchEvent>>// 新しいタッチ・ポイントが押されると呼び出される関数を定義します。
 + onTouchReleasedProperty() : ObjectProperty<EventHandler<? super TouchEvent>>// 新しいタッチ・ポイントが押されると呼び出される関数を定義します。
 + onTouchStationaryProperty() : ObjectProperty<EventHandler<? super TouchEvent>>// タッチ・ポイントが押されたまま静止しているときに呼び出される関数を定義します。
 + onZoomFinishedProperty() : ObjectProperty<EventHandler<? super ZoomEvent>>// ズーム・ジェスチャが終了すると呼び出される関数を定義します。
 + onZoomProperty() : ObjectProperty<EventHandler<? super ZoomEvent>>// ズーム・アクションをユーザーが実行すると呼び出される関数を定義します。
 + onZoomStartedProperty() : ObjectProperty<EventHandler<? super ZoomEvent>>// ズーム・ジェスチャが検出されると呼び出される関数を定義します。
 + removeEventFilter(EventType<T> eventType, EventHandler<? super T> eventFilter) : <T extends Event> void// 以前に登録したイベント・フィルタをこのシーンから登録解除します。
 + removeEventHandler(EventType<T> eventType, EventHandler<? super T> eventHandler) : <T extends Event> void// 以前に登録したイベント・ハンドラをこのシーンから登録解除します。
 + removeMnemonic(Mnemonic m) : void// 指定されたニーモニックを登録解除します。
 + rootProperty() : ObjectProperty<Parent>// シーン・グラフのルートNodeを定義します。
 + setCamera(Camera value) : void// プロパティcameraの値を設定します。
 + setCursor(Cursor value) : void// プロパティcursorの値を設定します。
 + setEventDispatcher(EventDispatcher value) : void// プロパティeventDispatcherの値を設定します。
 # setEventHandler(EventType<T> eventType, EventHandler<? super T> eventHandler) : <T extends Event> void// このイベント・タイプに使用するハンドラを設定します。
 + setFill(Paint value) : void// プロパティfillの値を設定します。
 + setNodeOrientation(NodeOrientation orientation) : void// プロパティnodeOrientationの値を設定します。
 + setOnContextMenuRequested(EventHandler<? super ContextMenuEvent> value) : void// プロパティonContextMenuRequestedの値を設定します。
 + setOnDragDetected(EventHandler<? super MouseEvent> value) : void// プロパティonDragDetectedの値を設定します。
 + setOnDragDone(EventHandler<? super DragEvent> value) : void// プロパティonDragDoneの値を設定します。
 + setOnDragDropped(EventHandler<? super DragEvent> value) : void// プロパティonDragDroppedの値を設定します。
 + setOnDragEntered(EventHandler<? super DragEvent> value) : void// プロパティonDragEnteredの値を設定します。
 + setOnDragExited(EventHandler<? super DragEvent> value) : void// プロパティonDragExitedの値を設定します。
 + setOnDragOver(EventHandler<? super DragEvent> value) : void// プロパティonDragOverの値を設定します。
 + setOnInputMethodTextChanged(EventHandler<? super InputMethodEvent> value) : void// プロパティonInputMethodTextChangedの値を設定します。
 + setOnKeyPressed(EventHandler<? super KeyEvent> value) : void// プロパティonKeyPressedの値を設定します。
 + setOnKeyReleased(EventHandler<? super KeyEvent> value) : void// プロパティonKeyReleasedの値を設定します。
 + setOnKeyTyped(EventHandler<? super KeyEvent> value) : void// プロパティonKeyTypedの値を設定します。
 + setOnMouseClicked(EventHandler<? super MouseEvent> value) : void// プロパティonMouseClickedの値を設定します。
 + setOnMouseDragEntered(EventHandler<? super MouseDragEvent> value) : void// プロパティonMouseDragEnteredの値を設定します。
 + setOnMouseDragExited(EventHandler<? super MouseDragEvent> value) : void// プロパティonMouseDragExitedの値を設定します。
 + setOnMouseDragged(EventHandler<? super MouseEvent> value) : void// プロパティonMouseDraggedの値を設定します。
 + setOnMouseDragOver(EventHandler<? super MouseDragEvent> value) : void// プロパティonMouseDragOverの値を設定します。
 + setOnMouseDragReleased(EventHandler<? super MouseDragEvent> value) : void// プロパティonMouseDragReleasedの値を設定します。
 + setOnMouseEntered(EventHandler<? super MouseEvent> value) : void// プロパティonMouseEnteredの値を設定します。
 + setOnMouseExited(EventHandler<? super MouseEvent> value) : void// プロパティonMouseExitedの値を設定します。
 + setOnMouseMoved(EventHandler<? super MouseEvent> value) : void// プロパティonMouseMovedの値を設定します。
 + setOnMousePressed(EventHandler<? super MouseEvent> value) : void// プロパティonMousePressedの値を設定します。
 + setOnMouseReleased(EventHandler<? super MouseEvent> value) : void// プロパティonMouseReleasedの値を設定します。
 + setOnRotate(EventHandler<? super RotateEvent> value) : void// プロパティonRotateの値を設定します。
 + setOnRotationFinished(EventHandler<? super RotateEvent> value) : void// プロパティonRotationFinishedの値を設定します。
 + setOnRotationStarted(EventHandler<? super RotateEvent> value) : void// プロパティonRotationStartedの値を設定します。
 + setOnScroll(EventHandler<? super ScrollEvent> value) : void// プロパティonScrollの値を設定します。
 + setOnScrollFinished(EventHandler<? super ScrollEvent> value) : void// プロパティonScrollFinishedの値を設定します。
 + setOnScrollStarted(EventHandler<? super ScrollEvent> value) : void// プロパティonScrollStartedの値を設定します。
 + setOnSwipeDown(EventHandler<? super SwipeEvent> value) : void// プロパティonSwipeDownの値を設定します。
 + setOnSwipeLeft(EventHandler<? super SwipeEvent> value) : void// プロパティonSwipeLeftの値を設定します。
 + setOnSwipeRight(EventHandler<? super SwipeEvent> value) : void// プロパティonSwipeRightの値を設定します。
 + setOnSwipeUp(EventHandler<? super SwipeEvent> value) : void// プロパティonSwipeUpの値を設定します。
 + setOnTouchMoved(EventHandler<? super TouchEvent> value) : void// プロパティonTouchMovedの値を設定します。
 + setOnTouchPressed(EventHandler<? super TouchEvent> value) : void// プロパティonTouchPressedの値を設定します。
 + setOnTouchReleased(EventHandler<? super TouchEvent> value) : void// プロパティonTouchReleasedの値を設定します。
 + setOnTouchStationary(EventHandler<? super TouchEvent> value) : void// プロパティonTouchStationaryの値を設定します。
 + setOnZoom(EventHandler<? super ZoomEvent> value) : void// プロパティonZoomの値を設定します。
 + setOnZoomFinished(EventHandler<? super ZoomEvent> value) : void// プロパティonZoomFinishedの値を設定します。
 + setOnZoomStarted(EventHandler<? super ZoomEvent> value) : void// プロパティonZoomStartedの値を設定します。
 + setRoot(Parent value) : void// プロパティrootの値を設定します。
 + setUserAgentStylesheet(String url) : void// このSceneで使用されるuser-agentスタイルシートのURLを、プラットフォーム・デフォルトのuser-agentスタイルシートのかわりに設定します。
 + setUserData(Object value) : void// 後で取得できる単一のObjectプロパティを設定するためのコンビニエンス・メソッド。
 + snapshot(Callback<SnapshotResult,Void> callback, WritableImage image) : void// 次のフレームでこのシーンのスナップショットを取得し、イメージの準備が整ったとき、指定されたコールバック・メソッドを呼び出します。
 + snapshot(WritableImage image) : WritableImage// このシーンのスナップショットを取得し、レンダリングされたイメージの準備が整ったときにそれを戻します。
 + startDragAndDrop(TransferMode... transferModes) : Dragboard// このScene上で認識されたドラッグ・アンド・ドロップ・ジェスチャの候補を確定します。
 + startFullDrag() : void// ジェスチャ・ソースとして、このシーンで完全な押下、ドラッグ、解放ジェスチャを開始します。
 + userAgentStylesheetProperty() : ObjectProperty<String>
 + widthProperty() : ReadOnlyDoubleProperty// このSceneの幅
 + windowProperty() : ReadOnlyObjectProperty<Window>// このSceneのWindow
 + xProperty() : ReadOnlyDoubleProperty// WindowのこのSceneの水平位置。
 + yProperty() : ReadOnlyDoubleProperty// WindowのこのSceneの垂直位置。
