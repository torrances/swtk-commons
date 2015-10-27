package org.swtk.commons.dict.wordnet.index.name.instance.m.a.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMALO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"malocclusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14084411\"]}");
	add("{\"term\":\"malodor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"malodorousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04987905\"]}");
	add("{\"term\":\"malodour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"malone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11172112\"]}");
	add("{\"term\":\"malonylurea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14796877\"]}");
	add("{\"term\":\"malope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12203969\"]}");
	add("{\"term\":\"malopterurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02521119\"]}");
	add("{\"term\":\"malory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11172321\"]}");
	add("{\"term\":\"malosma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12781482\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }