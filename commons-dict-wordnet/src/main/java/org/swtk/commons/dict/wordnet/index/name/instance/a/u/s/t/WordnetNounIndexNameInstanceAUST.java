package org.swtk.commons.dict.wordnet.index.name.instance.a.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"austen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10848897\"]}");
	add("{\"term\":\"austenite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14793921\"]}");
	add("{\"term\":\"austereness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04705014\"]}");
	add("{\"term\":\"austerity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04889193\"]}");
	add("{\"term\":\"austerlitz\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01272350\", \"08776005\"]}");
	add("{\"term\":\"austin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09165754\"]}");
	add("{\"term\":\"austral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13685667\"]}");
	add("{\"term\":\"australasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08855157\"]}");
	add("{\"term\":\"australia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09234173\", \"08849996\"]}");
	add("{\"term\":\"australian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06953052\", \"09710675\"]}");
	add("{\"term\":\"australopithecine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02478850\"]}");
	add("{\"term\":\"australopithecus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02478452\"]}");
	add("{\"term\":\"austria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08864547\"]}");
	add("{\"term\":\"austrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09711000\"]}");
	add("{\"term\":\"austrocedrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11653567\"]}");
	add("{\"term\":\"austronesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08855321\"]}");
	add("{\"term\":\"austronesian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06950308\", \"09710831\"]}");
	add("{\"term\":\"austrotaxus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11683215\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }