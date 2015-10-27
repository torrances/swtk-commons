package org.swtk.commons.dict.wordnet.index.name.instance.m.o.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMORA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12419187\"]}");
	add("{\"term\":\"moraine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09381804\"]}");
	add("{\"term\":\"moral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06618397\"]}");
	add("{\"term\":\"morale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04632486\", \"14397678\"]}");
	add("{\"term\":\"moralisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00266617\", \"06755627\"]}");
	add("{\"term\":\"moralism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00877740\", \"07168349\"]}");
	add("{\"term\":\"moralist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10316105\", \"10350644\"]}");
	add("{\"term\":\"morality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09206590\", \"04854001\"]}");
	add("{\"term\":\"moralization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00266617\", \"06755627\"]}");
	add("{\"term\":\"moralizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06755627\"]}");
	add("{\"term\":\"morals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09206590\"]}");
	add("{\"term\":\"morass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09378747\"]}");
	add("{\"term\":\"moratorium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14037222\", \"15300452\"]}");
	add("{\"term\":\"moravia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08776512\"]}");
	add("{\"term\":\"moray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02529902\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }