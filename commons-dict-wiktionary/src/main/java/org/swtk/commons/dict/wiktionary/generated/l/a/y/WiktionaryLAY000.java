package org.swtk.commons.dict.wiktionary.generated.l.a.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("layabout", "{\"term\":\"layabout\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lazy person\", \"priority\":1}]}, \"synonyms\":{}}");

	add("layer", "{\"term\":\"layer\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"{{PIE root|en|legʰ}}From Middle english (1100-1500) \u0027leyer\u0027 \u0027leyare\u0027 (a layer of stones or bricks) equivalent to {{suffix|lay|er|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A single thickness of some material covering a surface\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Wrap the loaf in two \u0027\u0027layers\u0027\u0027 of aluminum foil before putting it in the oven\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"After the first coat of paint dried, he applied another \u0027\u0027layer\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An item of clothing worn under or over another\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"It\u0027s cold now but it will warm up this afternoon. Make sure you wear \u0027\u0027layers\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A (usually) horizontal deposit; a stratum\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"I find seven-\u0027\u0027layer\u0027\u0027 cake a bit too rich\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"One of the items in a hierarchy\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"mired in \u0027\u0027layers\u0027\u0027 of deceit\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"a software \u0027\u0027layer\u0027\u0027 that translates keystrokes\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A person who lays things, such as tiles\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A mature female bird, insect, etc. that is able to lay eggs\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"When dealing with an infestation of headlice, the first step is to eliminate the \u0027\u0027layers\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"A hen kept to lay eggs\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"A shoot of a plant, laid underground for growth\", \"priority\":15}]}, \"synonyms\":{}}");

	add("layette", "{\"term\":\"layette\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027layette\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A complete set of clothing, bedding and toilet articles for a new baby\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An ERO (equipment repair order) parts bin in the United States Marine Corps, when discussing maintenance management and repair parts management. When conducting maintenance on a piece of equipment, or vehicle, parts are ordered. When parts come in they are placed into the bins until all the parts arrive, and then they are signed for by a mechanic and applied to the equipment, or vehicle\", \"priority\":2}]}, \"synonyms\":{}}");

	add("layman", "{\"term\":\"layman\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) {{compound|lay|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"layperson, someone who is not an ordained cleric or member of the clerg\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"by analogy, someone who is not a professional in a given fiel\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Carmen is not a professional anthropologist, but strictly a \u0027\u0027layman\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Let me explain it to you in \u0027\u0027layman\u0027s\u0027\u0027 terms\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"a common perso\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"a person who is untrained or lacks knowledge of a subjec\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Plato, \u0027Sophist\u0027. Translation by Lesley Brown. w:Stephanus 221d\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"should he be held to be just a \u0027\u0027layman\u0027\u0027, or does he have some art\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"a generally ignorant perso\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"lay-sister or lay-brother, person received into a convent of monks, following the vows, but not being member of the order\", \"priority\":10}]}, \"synonyms\":{}}");

	add("layup", "{\"term\":\"layup\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lay|up|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A close-range shot in which the shooter banks the ball off the backboard from a few feet away\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A relatively easy task\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Meeting the numbers will be a \u0027\u0027layup\u0027\u0027, if not a slam dunk\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }