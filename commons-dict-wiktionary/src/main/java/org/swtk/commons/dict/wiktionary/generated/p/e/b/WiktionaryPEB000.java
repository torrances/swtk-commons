package org.swtk.commons.dict.wiktionary.generated.p.e.b;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pebble", "{\"term\":\"pebble\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small stone, especially one rounded by the action of water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Shakespear\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the \u0027\u0027pebbles\u0027\u0027 on the hungry beac\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Milto\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"children gathering \u0027\u0027pebbles\u0027\u0027 on the shor\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A particle from 4 to 64 mm in diameter, following the Wentworth scal\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A small droplet of water intentionally sprayed on the ice that cause irregularities on the surface\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Transparent and colourless rock crystal\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Brazilian \u0027\u0027pebble\", \"priority\":9}]}, \"synonyms\":{}}");

	add("pebbledash", "{\"term\":\"pebbledash\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|pebble|dash|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"100px|thumb|Pebbledas\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A rendering for external walls, made by scattering small pebbles onto a coat of cement or plaster before it dries\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The school\u0027s walkway had a texture of \u0027\u0027pebbledash\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pebblesnail", "{\"term\":\"pebblesnail\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|pebble|snail|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various freshwater snails in the families and\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pébrine", "{\"term\":\"pébrine\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027pébrine\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A parasitic disease affecting silkworms\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Graham Robb, \u0027The Discovery of France\u0027, Picador 2008, p. 267\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In 1852, a disease called \u0027\u0027pébrine\u0027\u0027 began to spread among the silkworms.Category:en:DiseasesCategory:English terms spelled with É\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }