# Lifecycle Demo

An application to demonstrate UI lifecycle in Android

## Activities

### Lifecycle callbacks

- `onCreate()`
- `onStart()`
- `onRestart()`
- `onPause()`
- `onStop()`
- `onDestroy()`

### Scenarios

- *Start application*: `onCreate()` -> `onStart()` -> `onResume()`
- *Rotate screen*: `onPause()` -> `onStop()` -> `onDestroy()` -> `onCreate()` -> `onStart()`
  -> `onResume()` (Activity destroyed then recreated)
- *Press home*: `onPause()` -> `onStop()`
- *App killed*: `onDestroy()`