package org.swtk.commons.dict.wordnet.index.name.instance.c.a.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02959203\", \"09256622\"]}");
	add("{\"term\":\"capek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10901368\"]}");
	add("{\"term\":\"capelan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02543888\"]}");
	add("{\"term\":\"capelin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02543888\"]}");
	add("{\"term\":\"capella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02034406\", \"09257561\"]}");
	add("{\"term\":\"caper\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00428583\", \"00512828\", \"00513278\", \"00784446\", \"07838029\", \"11885540\"]}");
	add("{\"term\":\"capercaillie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799661\"]}");
	add("{\"term\":\"capercailzie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799661\"]}");
	add("{\"term\":\"capet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10911023\"]}");
	add("{\"term\":\"capetian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09911608\"]}");
	add("{\"term\":\"capeweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12004613\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }