package org.swtk.commons.dict.wiktionary.generated.o.s.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOSM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("osmazome", "{\"term\":\"osmazome\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A substance formerly supposed to impart the characteristic meaty smell and taste to certain dishes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmium", "{\"term\":\"osmium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ὀσμή\u0027 (smell) (because of the strong smell of its oxide) + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a heavy metallic chemical element (\u0027symbol\u0027 Os) with an atomic number of 76\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmobiosis", "{\"term\":\"osmobiosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|osmo|biosis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of cryptobiosis triggered by increased solute concentration in the solution in which the organism lives\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmolality", "{\"term\":\"osmolality\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The molality of an ideal solution that would exert the same osmotic pressure as the solution being considered\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmolarity", "{\"term\":\"osmolarity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The osmotic concentration of a solution, normally expressed as osmoles of solute per litre of solution\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmometry", "{\"term\":\"osmometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The measurement of osmotic pressure\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmoregulation", "{\"term\":\"osmoregulation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|osmo|regulation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The homeostatic regulation of osmotic pressure in the body in order to maintain a constant water content\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmosensation", "{\"term\":\"osmosensation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|osmo|sensation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The sensory perception of osmotic pressure\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmosensing", "{\"term\":\"osmosensing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The regulation of cell turgor in response to changes in the osmolarity of the external environment\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osmosensitivity", "{\"term\":\"osmosensitivity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|osmosensitive|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An organism\u0027s degree of sensitivity to osmotic gradient\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The mutant strain exhibited reduced \u0027\u0027osmosensitivity\", \"priority\":2}]}, \"synonyms\":{}}");

	add("osmotrophy", "{\"term\":\"osmotrophy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|osmo|trophy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The movement of dissolved nutrients by means of osmosis\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }