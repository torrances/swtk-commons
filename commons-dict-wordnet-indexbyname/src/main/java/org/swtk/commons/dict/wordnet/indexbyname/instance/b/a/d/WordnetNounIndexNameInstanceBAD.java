package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05151326\"]}");
	add("{\"term\":\"badaga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06992513\", \"09693792\"]}");
	add("{\"term\":\"baddeleyite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14692110\"]}");
	add("{\"term\":\"baddie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10773447\"]}");
	add("{\"term\":\"bade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06995885\"]}");
	add("{\"term\":\"badge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05859658\", \"06895611\"]}");
	add("{\"term\":\"badger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02449997\", \"09765867\"]}");
	add("{\"term\":\"badgerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10187158\"]}");
	add("{\"term\":\"badgering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00426281\"]}");
	add("{\"term\":\"badinage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06790800\"]}");
	add("{\"term\":\"badlands\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08519818\", \"09235479\"]}");
	add("{\"term\":\"badminton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00481519\"]}");
	add("{\"term\":\"badness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04916740\", \"05043870\", \"05151326\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }