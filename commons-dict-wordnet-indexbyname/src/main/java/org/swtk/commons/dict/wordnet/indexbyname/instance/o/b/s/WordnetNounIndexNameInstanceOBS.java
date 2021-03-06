package org.swtk.commons.dict.wordnet.indexbyname.instance.o.b.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOBS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"obscenity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00739995\", \"07139048\", \"04910545\"]}");
	add("{\"term\":\"obscurantism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00757823\", \"05996282\"]}");
	add("{\"term\":\"obscurantist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10389116\"]}");
	add("{\"term\":\"obscureness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04830647\", \"14009156\", \"14459904\"]}");
	add("{\"term\":\"obscurity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14009156\", \"14459495\", \"04830647\"]}");
	add("{\"term\":\"obsequiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04913889\"]}");
	add("{\"term\":\"obsequy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07466063\"]}");
	add("{\"term\":\"observance\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01206909\", \"05711376\", \"07465442\", \"00881437\"]}");
	add("{\"term\":\"observation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05711376\", \"05826885\", \"06779826\", \"00881437\", \"01004898\"]}");
	add("{\"term\":\"observation dome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03844944\"]}");
	add("{\"term\":\"observation post\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08614732\"]}");
	add("{\"term\":\"observation station\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03845054\"]}");
	add("{\"term\":\"observation tower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03694269\"]}");
	add("{\"term\":\"observatory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03694269\", \"03845191\"]}");
	add("{\"term\":\"observed fire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00994000\"]}");
	add("{\"term\":\"observer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10389227\", \"09649777\"]}");
	add("{\"term\":\"obsession\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05708366\", \"09206152\"]}");
	add("{\"term\":\"obsessive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10368720\"]}");
	add("{\"term\":\"obsessiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04633419\"]}");
	add("{\"term\":\"obsessivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04633419\"]}");
	add("{\"term\":\"obsidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14905111\"]}");
	add("{\"term\":\"obsolescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13545186\"]}");
	add("{\"term\":\"obsoleteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04932754\"]}");
	add("{\"term\":\"obstacle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845315\", \"05698074\"]}");
	add("{\"term\":\"obstacle race\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07477874\"]}");
	add("{\"term\":\"obstetrical delivery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00043279\"]}");
	add("{\"term\":\"obstetrical toad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01650780\"]}");
	add("{\"term\":\"obstetrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10389398\"]}");
	add("{\"term\":\"obstetrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06062970\"]}");
	add("{\"term\":\"obstinacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04870305\", \"04916012\"]}");
	add("{\"term\":\"obstinance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04870305\", \"04916012\"]}");
	add("{\"term\":\"obstipation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14395175\"]}");
	add("{\"term\":\"obstreperousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04915460\"]}");
	add("{\"term\":\"obstructer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845513\", \"10368974\"]}");
	add("{\"term\":\"obstruction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00563317\", \"01076422\", \"05698074\", \"14531553\", \"03845513\"]}");
	add("{\"term\":\"obstruction of justice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01183702\"]}");
	add("{\"term\":\"obstructionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01179421\"]}");
	add("{\"term\":\"obstructionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10368974\"]}");
	add("{\"term\":\"obstructive shock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14091163\"]}");
	add("{\"term\":\"obstructor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845513\", \"10368974\"]}");
	add("{\"term\":\"obstruent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130392\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }