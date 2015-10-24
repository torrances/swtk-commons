package org.swtk.commons.dict.wiktionary.generated.o.x.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOXE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oxea", "{\"term\":\"oxea\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{m|grc|ὀξέᾱ}}. Either from the {{grc-ion}} form of {{grc-att}} {{m|grc|ὀξεῖᾰ}}, (a feminine form of {{m|grc|ὀξῠ́ς||sharp}} applied to {{m|grc|ῥᾰ́βδος||wand; shaft}})\u0026lt;ref\u0026gt;{{R:OED Online|title\u003doxea|code\u003d135562|part of speech\u003dn|date\u003dDecember 2014}}\u0026lt;/ref\u0026gt; or a variant of {{m|grc|ὀξῠ́ᾱ}}, {{m|grc|ὀξῠ́η||beech; spear-shaft}}.\u0026lt;ref\u0026gt;{{R:LSJ|o)ce/a|w\u003dὀξέᾱ}}\u0026lt;br/\u0026gt;{{R:LSJ|o)cu/a|w\u003dὀξῠ́ᾱ}}\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a monoaxial spicule which is pointed at both ends\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oxeye", "{\"term\":\"oxeye\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ox|eye|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Several daisy-like flowers in various genera, especially the oxeye daisy\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The corn camomile\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of a genus of composite plants () with large yellow flowers\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A titmouse, especially the great titmouse (\u0027Parus major\u0027) or the blue titmouse\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The dunlin\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A fish; the bogue, or box\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }