package org.swtk.commons.dict.wiktionary.generated.l.u.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLUT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lutz", "{\"term\":\"lutz\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the surname of Austrian skater wikipedia:Alois Lutz|Alois Lutz who invented the jump.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A jump in which the skater takes off from the back outside edge of one skate, rotates counterclockwise and lands on the back outside edge of the other skate\", \"priority\":1}]}, \"synonyms\":{}}");

	add("luter", "{\"term\":\"luter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lute|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who applies lute\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A musician who plays a lute\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lutecium", "{\"term\":\"lutecium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Category:en:Chemical elements\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutein", "{\"term\":\"lutein\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A yellow carotenoid pigment, widely distributed in both plants and right|300px\", \"priority\":1}]}, \"synonyms\":{}}");

	add("luteoskyrin", "{\"term\":\"luteoskyrin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hepatotoxin produced by \u0027Penicillium islandicum\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutetian", "{\"term\":\"lutetian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A subdivision of the Eocene epoch\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutetium", "{\"term\":\"lutetium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027lutetia\u0027 (paris, the capital of france)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A metallic chemical element (\u0027symbol\u0027 Lu) with an atomic number of 71\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutheranism", "{\"term\":\"lutheranism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Eponym from w:Martin Luther|Martin Luther.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Christian denomination based on the beliefs and doctrines developed by w:Martin Martin Luther and his immediate followers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutherie", "{\"term\":\"lutherie\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French \u0027lutherie\u0027 (lang\u003dfr)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The craft of making stringed musical instruments\", \"priority\":1}]}, \"synonyms\":{}}");

	add("luthier", "{\"term\":\"luthier\", \"etymology\":{\"influencers\":[{}], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027luthier\u0027 from \u0027luth\u0027 (lute)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who, or a business which, makes or repairs stringed wooden musical instruments, such as lutes, violins, and guitars\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutist", "{\"term\":\"lutist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lute|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who plays the lute\", \"priority\":1}]}, \"synonyms\":{}}");

	add("luton", "{\"term\":\"luton\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A town in Bedfordshire, England\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lutropin", "{\"term\":\"lutropin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"luteinizing hormone\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }