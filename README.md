# Playground for smooth RxJava v2 <-> v3 interop idea

## Steps to Play

### Step 1: Clone my RxJava fork

```console
git clone https://github.com/artem-zinnatullin/RxJava.git RxJavaArtemFork
```

### Step 2: Publish modified RxJava v2 and v3 to maven local

```console
cd RxJavaArtemFork

git checkout az/2.x-to-3.x-interop
TRAVIS_TAG=2.2.11-ARTEM1 ./gradlew publishToMavenLocal

git checkout az/3.x-to-2.x-interop
TRAVIS_TAG=3.0.0-RC1-ARTEM1 ./gradlew publishToMavenLocal
```

### Step 3: You can now play with Playground

Open it in IntelliJ or other IDE/editor.

And/or build from Terminal:

```console
cd RxJava2To3InteropIntegrationTest
./gradlew build
```
