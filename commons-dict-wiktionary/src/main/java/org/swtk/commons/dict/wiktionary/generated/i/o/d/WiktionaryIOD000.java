package org.swtk.commons.dict.wiktionary.generated.i.o.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIOD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("iodal", "{\"term\":\"iodal\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The compound trichloroacetaldehyde, CI\u0026lt;sub\u0026gt;3\u0026lt;/sub\u0026gt;-CHO\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodine", "{\"term\":\"iodine\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"From French \u0027iode\u0027 () from Ancient greek (to 1453) \u0027ἰοειδής\u0027 (violet) + -ine\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A chemical element (\u0027symbol\u0027: I) with an atomic number of 53; one of the halogens\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An antiseptic incorporating the element\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An iodide\", \"priority\":3}]}, \"synonyms\":{}}");

	add("iodobenzamide", "{\"term\":\"iodobenzamide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dopamine antagonist used as a radioactive tracer in brain studies\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodoethane", "{\"term\":\"iodoethane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The aliphatic halogenated hydrocarbon C\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;H\u0026lt;sub\u0026gt;5\u0026lt;/sub\u0026gt;I that is used in organic synthesis to introduce an ethyl group into compounds\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodoform", "{\"term\":\"iodoform\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|iodo|form|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A halogenated hydrocarbon, CHI\u0026lt;sub\u0026gt;3\u0026lt;/sub\u0026gt;; a yellow crystalline compound, formerly used as a mild antiseptic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodometry", "{\"term\":\"iodometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|iodo|metry|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An analytical technique that uses the sudden disappearance (or appearance) of iodine to mark the end of a redox titration\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodonitrotetrazolium", "{\"term\":\"iodonitrotetrazolium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The univalent radical \u00272-(4-iodophenyl)-3-(4-nitrophenyl)-5-phenyltetrazolium\", \"priority\":1}]}, \"synonyms\":{}}");

	add("iodosulfite", "{\"term\":\"iodosulfite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|iodo|sulfite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The anion SO\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;I\u0026lt;sup\u0026gt;-\u0026lt;/sup\u0026gt; or any salt containing this anion\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }