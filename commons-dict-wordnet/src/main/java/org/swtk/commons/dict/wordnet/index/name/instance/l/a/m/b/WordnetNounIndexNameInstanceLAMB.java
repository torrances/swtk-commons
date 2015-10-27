package org.swtk.commons.dict.wordnet.index.name.instance.l.a.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lamb\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07682896\", \"10263569\", \"10263685\", \"11135019\", \"02415086\"]}");
	add("{\"term\":\"lambchop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07683719\"]}");
	add("{\"term\":\"lambda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05240931\", \"06848256\"]}");
	add("{\"term\":\"lambdacism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14426029\"]}");
	add("{\"term\":\"lambency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961711\"]}");
	add("{\"term\":\"lambert\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11135121\", \"13661999\"]}");
	add("{\"term\":\"lambertia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12240392\"]}");
	add("{\"term\":\"lambis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01946008\"]}");
	add("{\"term\":\"lambkill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258590\"]}");
	add("{\"term\":\"lambkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02415275\"]}");
	add("{\"term\":\"lambrequin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03640399\", \"03640527\"]}");
	add("{\"term\":\"lambskin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14783182\", \"14789195\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }