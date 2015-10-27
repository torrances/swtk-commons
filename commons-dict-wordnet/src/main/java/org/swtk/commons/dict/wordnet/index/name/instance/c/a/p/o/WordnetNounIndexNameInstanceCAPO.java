package org.swtk.commons.dict.wordnet.index.name.instance.c.a.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"capo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09911862\"]}");
	add("{\"term\":\"capon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01795171\", \"07660993\"]}");
	add("{\"term\":\"capone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10901536\"]}");
	add("{\"term\":\"caporetto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01276664\"]}");
	add("{\"term\":\"capote\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02960319\", \"02960444\"]}");
	add("{\"term\":\"capoten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02961438\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }