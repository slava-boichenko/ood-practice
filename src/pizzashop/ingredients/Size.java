package pizzashop.ingredients;

public enum Size {

    REGULAR(1),
    LARGE(1.25f),
    EXTRA_LARGE(1.5f);

    final float multiplier;

    Size(float multiplier) {
        this.multiplier = multiplier;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
