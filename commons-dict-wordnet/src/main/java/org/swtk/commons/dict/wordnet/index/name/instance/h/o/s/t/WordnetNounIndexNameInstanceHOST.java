package org.swtk.commons.dict.wordnet.index.name.instance.h.o.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"host\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"04182208\", \"07698883\", \"10206393\", \"10206975\", \"08498195\", \"08200720\", \"10318917\", \"01388168\", \"08199880\", \"10206749\"]}");
	add("{\"term\":\"hosta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12478024\"]}");
	add("{\"term\":\"hostaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12477755\"]}");
	add("{\"term\":\"hostage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10207176\"]}");
	add("{\"term\":\"hostel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03546717\", \"03546876\"]}");
	add("{\"term\":\"hosteller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10206569\", \"10207609\"]}");
	add("{\"term\":\"hostelry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546876\"]}");
	add("{\"term\":\"hostess\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10675314\", \"10206678\", \"10207110\"]}");
	add("{\"term\":\"hostile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08414632\"]}");
	add("{\"term\":\"hostilities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00966892\"]}");
	add("{\"term\":\"hostility\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00966680\", \"07563271\", \"14003773\", \"04665463\"]}");
	add("{\"term\":\"hostler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663740\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }