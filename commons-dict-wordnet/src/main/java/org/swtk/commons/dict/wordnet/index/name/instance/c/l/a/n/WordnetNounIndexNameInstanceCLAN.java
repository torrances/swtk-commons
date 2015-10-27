package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07986142\"]}");
	add("{\"term\":\"clang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394744\"]}");
	add("{\"term\":\"clanger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00077213\"]}");
	add("{\"term\":\"clangor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394744\"]}");
	add("{\"term\":\"clangoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394744\"]}");
	add("{\"term\":\"clangour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394744\"]}");
	add("{\"term\":\"clangula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01856404\"]}");
	add("{\"term\":\"clank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394744\"]}");
	add("{\"term\":\"clannishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04896532\"]}");
	add("{\"term\":\"clansman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10327942\"]}");
	add("{\"term\":\"clanswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10327942\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }