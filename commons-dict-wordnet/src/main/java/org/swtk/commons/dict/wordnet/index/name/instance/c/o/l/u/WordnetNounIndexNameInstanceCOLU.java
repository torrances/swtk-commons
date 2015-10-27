package org.swtk.commons.dict.wordnet.index.name.instance.c.o.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOLU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coluber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01733320\"]}");
	add("{\"term\":\"colubrid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01730287\"]}");
	add("{\"term\":\"colubridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01729601\"]}");
	add("{\"term\":\"colubrina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13163472\"]}");
	add("{\"term\":\"colugo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02505145\"]}");
	add("{\"term\":\"columba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01815112\", \"09273457\"]}");
	add("{\"term\":\"columbarium\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03077549\", \"03077698\", \"03233395\"]}");
	add("{\"term\":\"columbary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03233395\"]}");
	add("{\"term\":\"columbia\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03077836\", \"09129124\", \"09161073\", \"09163404\", \"09273584\"]}");
	add("{\"term\":\"columbidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01814323\"]}");
	add("{\"term\":\"columbiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01813107\"]}");
	add("{\"term\":\"columbine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11747560\"]}");
	add("{\"term\":\"columbite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14708020\"]}");
	add("{\"term\":\"columbium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14671332\"]}");
	add("{\"term\":\"columbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12313394\"]}");
	add("{\"term\":\"columbus\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09099921\", \"09127220\", \"10925067\", \"09153681\"]}");
	add("{\"term\":\"columella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13923607\"]}");
	add("{\"term\":\"column\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"05593649\", \"06279010\", \"03077981\", \"03078384\", \"06279220\", \"13923115\", \"08450585\", \"03078578\", \"08446009\"]}");
	add("{\"term\":\"columnea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12852295\"]}");
	add("{\"term\":\"columniation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05083238\"]}");
	add("{\"term\":\"columnist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09958612\"]}");
	add("{\"term\":\"colutea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12538810\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }