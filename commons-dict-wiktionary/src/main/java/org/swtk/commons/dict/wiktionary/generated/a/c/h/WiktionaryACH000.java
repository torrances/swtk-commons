package org.swtk.commons.dict.wiktionary.generated.a.c.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryACH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("achaean", "{\"term\":\"achaean\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Latin \u0027achaeus\u0027 or \u0027achaius\u0027 from Ancient greek (to 1453) \u0027lang\u003dgrc\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inhabitant or a resident of Achaea\", \"priority\":1}]}, \"synonyms\":{}}");

	add("achene", "{\"term\":\"achene\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From French \u0027akène\u0027 and its source, Latin \u0027achena\u0027 from Ancient greek (to 1453) \u0027ἀ-\u0027 (a-) + \u0027χαίνω\u0027 (to gape)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small, dry, indehiscent fruit, containing a single seed, as in the buttercup\", \"priority\":1}]}, \"synonyms\":{}}");

	add("achievement", "{\"term\":\"achievement\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"French\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027achevement\u0027 from the verb \u0027achever\u0027 \u0027achiever\u0027 (to finish) Compare Modern French \u0027achèvement\u0027, English hatchment\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of achieving or performing; a successful performance; accomplishmen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d1|url\u003dhttp://openlibrary.org/works/OL2004261W|passage\u003dThe original family who had begun to build a palace to rival Nonesuch had died out before they had put up little more than the gateway, so that the actual structure which had come down to posterity retained the secret magic of a promise rather than the overpowering splendour of a great architectural \u0027\u0027achievement\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dCreating a complete map of the human connectome would therefore be a monumental milestone but not the end of the journey to understanding how our brains work. The \u0027\u0027achievement\u0027\u0027 will transform neuroscience and serve as the starting point for asking questions we could not otherwise have answered,\u0026amp;nbsp;[\u0026amp;hellip\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A great or heroic deed or feat; something accomplished by valor or boldnes\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The exploits] of the ancient saints do far surpass the most famous \u0027\u0027achievements\u0027\u0027 of pagan heroes\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The highest \u0027\u0027achievements\u0027\u0027 of the human intellect\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"An escutcheon or ensign armorial; now generally applied to the funeral shield commonly called hatchment\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"An award for completing a particular task or meeting an objective in a video game\", \"priority\":8}]}, \"synonyms\":{}}");

	add("achiote", "{\"term\":\"achiote\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Spanish \u0027achiote\u0027 from Classical nahuatl {{m|nci|āchiyōtl}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tropical American evergreen shrub, \u0027Bixa orellana\u0027; the lipstick tree\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The seed of this tree used as a colouring or in Latin American cooking\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An orange-red dye obtained from this seed\", \"priority\":3}]}, \"synonyms\":{}}");

	add("achromat", "{\"term\":\"achromat\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"By shortening of achromatic.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lens that imparts little color; a lens that is achromatic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("achromia", "{\"term\":\"achromia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|a|chromia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Absence of pigmentation, especially in the skin or blood\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }