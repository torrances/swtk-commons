package org.swtk.commons.dict.wordnet.index.name.instance.s.a.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSARD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15044301\"]}");
	add("{\"term\":\"sarda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02630316\"]}");
	add("{\"term\":\"sardegna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08828483\", \"08828638\"]}");
	add("{\"term\":\"sardina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02535706\"]}");
	add("{\"term\":\"sardine\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02535840\", \"15044301\", \"02535233\", \"07810039\"]}");
	add("{\"term\":\"sardinia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08828483\", \"08828638\"]}");
	add("{\"term\":\"sardinian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06977342\", \"10571713\"]}");
	add("{\"term\":\"sardinops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02536055\"]}");
	add("{\"term\":\"sardis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09065150\"]}");
	add("{\"term\":\"sardius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15044301\"]}");
	add("{\"term\":\"sardonyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15044539\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }