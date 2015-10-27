package org.swtk.commons.dict.wordnet.index.name.instance.c.a.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCACO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cacodaemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09565670\"]}");
	add("{\"term\":\"cacodemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09565670\"]}");
	add("{\"term\":\"cacodyl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14812884\", \"14813045\"]}");
	add("{\"term\":\"cacoethes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09204454\"]}");
	add("{\"term\":\"cacogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14069317\"]}");
	add("{\"term\":\"cacogenics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06052221\"]}");
	add("{\"term\":\"cacography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06415790\"]}");
	add("{\"term\":\"cacomistle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02511373\"]}");
	add("{\"term\":\"cacomixle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02511373\"]}");
	add("{\"term\":\"cacophony\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04992187\", \"07392073\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }