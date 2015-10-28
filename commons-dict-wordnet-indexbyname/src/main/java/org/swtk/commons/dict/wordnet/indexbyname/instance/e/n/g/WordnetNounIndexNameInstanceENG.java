package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"engagement\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"01241629\", \"07352714\", \"00271763\", \"01220349\", \"07242871\", \"08401740\", \"00955670\"]}");
	add("{\"term\":\"engelmannia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11985317\"]}");
	add("{\"term\":\"engels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10979215\"]}");
	add("{\"term\":\"engine\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03292914\", \"03690149\", \"11437675\", \"03292644\"]}");
	add("{\"term\":\"engineer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10077522\", \"09638837\"]}");
	add("{\"term\":\"engineering\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03293411\", \"06134474\", \"00951878\"]}");
	add("{\"term\":\"enginery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03293554\"]}");
	add("{\"term\":\"england\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08891234\"]}");
	add("{\"term\":\"english\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07457169\", \"06165130\", \"09752082\", \"06959794\"]}");
	add("{\"term\":\"englishman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09720999\"]}");
	add("{\"term\":\"englishwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09721229\"]}");
	add("{\"term\":\"engorgement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00842291\", \"14344562\"]}");
	add("{\"term\":\"engram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05944099\"]}");
	add("{\"term\":\"engraulidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02536339\"]}");
	add("{\"term\":\"engraulis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02536667\"]}");
	add("{\"term\":\"engraver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10077835\", \"10077963\"]}");
	add("{\"term\":\"engraving\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00940607\", \"03293936\", \"03294179\"]}");
	add("{\"term\":\"engrossment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04872953\", \"05708052\", \"05712213\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }