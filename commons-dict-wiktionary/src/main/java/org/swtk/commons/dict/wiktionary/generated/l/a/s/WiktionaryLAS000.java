package org.swtk.commons.dict.wiktionary.generated.l.a.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lass", "{\"term\":\"lass\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old norse\"], \"text\":\"From Middle english (1100-1500) \u0027lasse\u0027 from Old norse *\u0027\u0027 (lasqa) Cognate with Scots \u0027lassie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A young woman or girl\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;Come and dance, ye lads and \u0027\u0027lasses\u0027\u0027!\u0026quot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A sweetheart\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lasagna", "{\"term\":\"lasagna\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Italian\", \"Latin\"], \"text\":\"From Italian \u0027lasagna\u0027 \u0027lasagne\u0027 from Latin \u0027lasanum\u0027 (cooking pot) from Ancient greek (to 1453) \u0027λάσανον\u0027 (trivet or stand for a pot) pl. \u0027λάσανα\u0027 Others argue the Italian \u0027lasagna\u0027 originally derived from the Arabic (Semitic) \u0027lawzinaj\u0027 (\u0026quot;almond cake\u0026quot;).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flat sheet of pasta\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An Italian baked dish comprising layers of such pasta with (usually) bolognese and bechamel sauce\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lasciviousness", "{\"term\":\"lasciviousness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lascivious|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or characteristic of being lascivious\", \"priority\":1}]}, \"synonyms\":{}}");

	add("laserwort", "{\"term\":\"laserwort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|laser|wort|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An umbelliferous plant (\u0027Laserpitium latifolium\u0027) from which the resin laser was obtained\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lasher", "{\"term\":\"lasher\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lash|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who whips or lashes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A piece of rope for binding or making fast one thing to another\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A weir in a river\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lashing", "{\"term\":\"lashing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something used to tie something or lash it to something\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027lashings\u0027\u0027, that were holding the chest to the deck of the storm tossed ship, broke and it went overboard\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"in the form \u0026quot;lashings of\u0026quot;): plenty o\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Lashings\u0027\u0027 of ginger beer\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The act of one who, or that which, lashes; castigation; chastisement\", \"priority\":5}]}, \"synonyms\":{}}");

	add("lassie", "{\"term\":\"lassie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A name given to female dogs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lassitude", "{\"term\":\"lassitude\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027lang\u003dfr\u0027 from Latin {{m|la|lassitūdō||faintness, weariness}}, from \u0027lang\u003dla|lassus\u0027 () perhaps for *\u0027ladtus\u0027, and thus akin to E. \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Lethargy or lack of energy; fatigue\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Listlessness or languor\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lastol", "{\"term\":\"lastol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of polyolefin where the olefin units are cross-linked synthetic polymers with low but significant crystallinity, composed of at least 95% by mass of ethylene and at least one other olefin unit, and where the fibre is substantially elastic and heat-resistant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lastrile", "{\"term\":\"lastrile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A kind of elastic fiber made from a co-polymer composed of a diene and of not more than 50 per cent but not less than 10 per cent by mass of acrylonitrile units\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }