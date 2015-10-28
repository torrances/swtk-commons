package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851183\"]}");
	add("{\"term\":\"orache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11851183\"]}");
	add("{\"term\":\"oracle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03858428\", \"06763053\", \"10503115\"]}");
	add("{\"term\":\"oradexon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777987\"]}");
	add("{\"term\":\"oral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07213506\"]}");
	add("{\"term\":\"oran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08724477\"]}");
	add("{\"term\":\"orang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02483126\"]}");
	add("{\"term\":\"orange\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09402617\", \"15015777\", \"12729053\", \"04972356\", \"07763583\"]}");
	add("{\"term\":\"orangeade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07942682\"]}");
	add("{\"term\":\"orangeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400198\"]}");
	add("{\"term\":\"orangeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04972356\"]}");
	add("{\"term\":\"orangery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13273571\"]}");
	add("{\"term\":\"orangewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12729280\"]}");
	add("{\"term\":\"orangutan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02483126\"]}");
	add("{\"term\":\"orangutang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02483126\"]}");
	add("{\"term\":\"orasone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777593\"]}");
	add("{\"term\":\"oration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07256211\"]}");
	add("{\"term\":\"orator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400371\"]}");
	add("{\"term\":\"oratorio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07055995\"]}");
	add("{\"term\":\"oratory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07255865\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }