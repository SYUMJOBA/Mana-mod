package net.minecraft.tags;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.Registry;
import net.minecraft.world.level.material.Fluid;

public final class FluidTags {
   protected static final StaticTagHelper<Fluid> HELPER = StaticTags.create(Registry.FLUID_REGISTRY, "tags/fluids");
   private static final List<Tag<Fluid>> KNOWN_TAGS = Lists.newArrayList();
   public static final Tag.Named<Fluid> WATER = bind("water");
   public static final Tag.Named<Fluid> LAVA = bind("lava");

   private FluidTags() {
   }

   public static Tag.Named<Fluid> bind(String p_13135_) {
      Tag.Named<Fluid> named = HELPER.bind(p_13135_);
      KNOWN_TAGS.add(named);
      return named;
   }

   public static TagCollection<Fluid> getAllTags() {
      return HELPER.getAllTags();
   }

   @Deprecated
   public static List<Tag<Fluid>> getStaticTags() {
      return KNOWN_TAGS;
   }

   public static net.minecraftforge.common.Tags.IOptionalNamedTag<Fluid> createOptional(net.minecraft.resources.ResourceLocation name) {
      return createOptional(name, null);
   }

   public static net.minecraftforge.common.Tags.IOptionalNamedTag<Fluid> createOptional(net.minecraft.resources.ResourceLocation name, @javax.annotation.Nullable java.util.Set<java.util.function.Supplier<Fluid>> defaults) {
      return HELPER.createOptional(name, defaults);
   }
}
