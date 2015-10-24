package org.swtk.commons.dict.wiktionary.generated.h.a.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hashish", "{\"term\":\"hashish\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027حَشِيش\u0027 (hay, dried herb)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The leaves and tender parts of the Indian hemp plant (which are intoxicating), which are dried for either chewing or smoking\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1855\u0027\u0027, Sir Richard Burton, \u0027Personal Narrative of a Pilgrimage to Al-Madinah and Meccah\u0027, Dover 1964, p. 44\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Coyly at first, but less guardedly as we grew bolder, we smoked the forbidden weed \u0026quot;\u0027\u0027Hashísh\u0027\u0027,\u0026quot; conversing lengthily the while about that world of which I had seen so much\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1876:\u0027\u0027 Louisa May Alcott, \u0027Eight Cousins\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"You know \u0027\u0027hasheesh\u0027\u0027 is the extract of hemp\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A cannabis extract\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Marijuana generally\", \"priority\":7}]}, \"synonyms\":{}}");

	add("hassle", "{\"term\":\"hassle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Trouble, bother, unwanted annoyances or problems\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I went through a lot of \u0027\u0027hassle\u0027\u0027 to be the first to get a ticket\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A fight or argument\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An action which is not worth the difficulty involved\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hassock", "{\"term\":\"hassock\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) \u0027hassuc\u0027 of uncertain origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dense clump of grass or vegetation; a tussock\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A cushion used primarily in churches for kneeling on while praying\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1978\u0027\u0027, \u0027Livia\u0027, Faber \u0026amp; Faber 1992 (\u0027Avignon Quintet\u0027), p. 357\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"At the next service he found a flower on his \u0027\u0027hassock\u0027\u0027 and a highly suggestive Catholic bookmarker tucked into his hymn-book\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A thick cushion used as a seat; an ottoman or pouffe\", \"priority\":5}]}, \"synonyms\":{}}");

	add("hastener", "{\"term\":\"hastener\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hasten|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"agent Agent noun of hasten; one who hastens\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A stand or reflector used for confining the heat of the fire to meat while roasting before it\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hastiness", "{\"term\":\"hastiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hasty|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being hasty\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hastite", "{\"term\":\"hastite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orthorhombic-dipyramidal mineral containing cobalt and selenium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }