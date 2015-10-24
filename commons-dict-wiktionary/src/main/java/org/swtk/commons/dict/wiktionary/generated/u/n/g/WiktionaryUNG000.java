package org.swtk.commons.dict.wiktionary.generated.u.n.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ungenerosity", "{\"term\":\"ungenerosity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|generosity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being ungenerous\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ungenerousness", "{\"term\":\"ungenerousness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ungenerous|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being ungenerous\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ungiectomy", "{\"term\":\"ungiectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"surgical removal of a fingernail or toenail\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ungratefulness", "{\"term\":\"ungratefulness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ungrateful|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being ungrateful\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unguent", "{\"term\":\"unguent\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"Welsh\", \"German\", \"English\", \"old high german (ca. 750-1050)\", \"Latin\"], \"text\":\"From Latin \u0027unguentum\u0027 (ointment) from \u0027unguō\u0027 (i smear with ointment) from Proto-indo-european {{m|ine-pro|*ongw-||to salve}}.Cognates include w:Old Prussian|Old Prussian \u0027anctan\u0027 Old high german (ca. 750-1050) \u0027ancho\u0027 (German \u0027anke\u0027 (butter) , Welsh \u0027ymenyn\u0027 (butter)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any cream containing medicinal ingredients applied to the skin for therapeutic purposes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1809-1812\u0027\u0027 — w:William William Combe, Tour of Doctor Syntax in Search of the Picturesqu\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;Alas!\u0026quot; said Syntax, \u0026quot;could I pop / Just now, upon a blacksmith\u0027s shop, / Whose cooling \u0027\u0027unguents\u0027\u0027 would avail / To save poor Grizzle\u0027s ears and tail!\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1853\u0027\u0027 — w:Nathaniel Nathaniel Hawthorne, \u0027s:The Golden The Golden Fleece\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"So she put a golden box into his hand, and directed him how to apply the perfumed \u0027\u0027unguent\u0027\u0027 which it contained, and where to meet her at midnight\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1890\u0027\u0027 — w:Arthur Conan Arthur Conan Doyle, \u0027s:A Literary A Literary Mosaic\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Thou knowest of old that my temper is somewhat choleric, and my tongue not greased with that \u0027\u0027unguent\u0027\u0027 which oils the mouths of the lip-serving lords of the land\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }