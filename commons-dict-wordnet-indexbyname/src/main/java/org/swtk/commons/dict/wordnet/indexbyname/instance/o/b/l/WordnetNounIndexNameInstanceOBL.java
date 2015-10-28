package org.swtk.commons.dict.wordnet.indexbyname.instance.o.b.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOBL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oblate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10368605\"]}");
	add("{\"term\":\"oblateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05077791\"]}");
	add("{\"term\":\"oblation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01043381\", \"01043530\"]}");
	add("{\"term\":\"obligation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06785951\", \"13419414\", \"13804245\", \"14513694\", \"01132241\"]}");
	add("{\"term\":\"obligato\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06828828\", \"07043068\"]}");
	add("{\"term\":\"obliger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388865\"]}");
	add("{\"term\":\"obligingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04648510\"]}");
	add("{\"term\":\"oblique\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05565472\", \"06322324\"]}");
	add("{\"term\":\"obliqueness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04926889\", \"05073502\"]}");
	add("{\"term\":\"obliquity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04882134\", \"14072580\"]}");
	add("{\"term\":\"obliteration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07345613\", \"00219075\"]}");
	add("{\"term\":\"obliterator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09398990\"]}");
	add("{\"term\":\"oblivion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05681978\", \"14460235\"]}");
	add("{\"term\":\"obliviousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05681978\"]}");
	add("{\"term\":\"oblong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13896000\"]}");
	add("{\"term\":\"oblongness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05079038\"]}");
	add("{\"term\":\"obloquy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06732328\", \"14464964\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }