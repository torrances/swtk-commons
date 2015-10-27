package org.swtk.commons.dict.wordnet.index.name.instance.p.h.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phlebectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00691385\"]}");
	add("{\"term\":\"phlebitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14376295\"]}");
	add("{\"term\":\"phlebodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13197771\"]}");
	add("{\"term\":\"phlebogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04533407\"]}");
	add("{\"term\":\"phlebothrombosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14376413\"]}");
	add("{\"term\":\"phlebotomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10446127\"]}");
	add("{\"term\":\"phlebotomus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02206736\", \"14242969\"]}");
	add("{\"term\":\"phlebotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00699862\"]}");
	add("{\"term\":\"phlegm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04643310\", \"05423159\", \"07498922\"]}");
	add("{\"term\":\"phleum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12150925\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }