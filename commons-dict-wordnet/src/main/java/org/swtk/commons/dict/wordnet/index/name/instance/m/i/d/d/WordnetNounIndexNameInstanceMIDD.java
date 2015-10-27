package org.swtk.commons.dict.wordnet.index.name.instance.m.i.d.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIDD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"midday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15190537\"]}");
	add("{\"term\":\"midden\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07978909\", \"08578097\"]}");
	add("{\"term\":\"middle\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"15291496\", \"05563106\", \"05876894\", \"08540894\"]}");
	add("{\"term\":\"middlebreaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03683092\"]}");
	add("{\"term\":\"middlebrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10333840\"]}");
	add("{\"term\":\"middleman\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09979596\", \"10230706\", \"10242167\"]}");
	add("{\"term\":\"middleton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11198771\"]}");
	add("{\"term\":\"middleweight\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10333963\", \"10334080\", \"10334175\"]}");
	add("{\"term\":\"middling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03767602\"]}");
	add("{\"term\":\"middy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03767773\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }