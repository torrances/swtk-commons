package org.swtk.commons.dict.wordnet.index.name.instance.l.a.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLANC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lancashire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08905033\"]}");
	add("{\"term\":\"lancaster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08172664\", \"08893496\"]}");
	add("{\"term\":\"lancastrian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09723453\", \"09723553\"]}");
	add("{\"term\":\"lance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03642932\", \"04278258\", \"04278001\"]}");
	add("{\"term\":\"lancelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01470445\"]}");
	add("{\"term\":\"lancelot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11135283\"]}");
	add("{\"term\":\"lancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10264515\"]}");
	add("{\"term\":\"lancers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00541653\"]}");
	add("{\"term\":\"lancet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03642932\", \"03643101\"]}");
	add("{\"term\":\"lancetfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02546905\"]}");
	add("{\"term\":\"lancewood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11716919\", \"11717075\"]}");
	add("{\"term\":\"lanchou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08744415\"]}");
	add("{\"term\":\"lanchow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08744415\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }