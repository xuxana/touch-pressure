# touch-pressure

Capacitor plugin to control the user's touch pressure on the screen

## Install

```bash
npm install touch-pressure
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`startListening()`](#startlistening)
* [`stopListening()`](#stoplistening)
* [`is3DTouchAvailable()`](#is3dtouchavailable)
* [`isPressureSensitiveAvailable()`](#ispressuresensitiveavailable)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### startListening()

```typescript
startListening() => Promise<void>
```

--------------------


### stopListening()

```typescript
stopListening() => Promise<void>
```

--------------------


### is3DTouchAvailable()

```typescript
is3DTouchAvailable() => Promise<{ available: boolean; }>
```

**Returns:** <code>Promise&lt;{ available: boolean; }&gt;</code>

--------------------


### isPressureSensitiveAvailable()

```typescript
isPressureSensitiveAvailable() => Promise<{ available: boolean; }>
```

**Returns:** <code>Promise&lt;{ available: boolean; }&gt;</code>

--------------------

</docgen-api>
