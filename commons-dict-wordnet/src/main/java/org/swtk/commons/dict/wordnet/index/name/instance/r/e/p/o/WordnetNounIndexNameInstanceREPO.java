package org.swtk.commons.dict.wordnet.index.name.instance.r.e.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"report\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06216934\", \"06421395\", \"07234960\", \"07406116\", \"06694296\", \"07232584\", \"07233130\"]}");
	add("{\"term\":\"reportage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06696529\"]}");
	add("{\"term\":\"reporter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10541255\"]}");
	add("{\"term\":\"reporting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06696529\"]}");
	add("{\"term\":\"repose\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04911529\", \"07531029\", \"01066072\"]}");
	add("{\"term\":\"repositing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00373415\"]}");
	add("{\"term\":\"reposition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00373415\"]}");
	add("{\"term\":\"repositioning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01054663\"]}");
	add("{\"term\":\"repository\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04083825\", \"10541521\", \"03182015\"]}");
	add("{\"term\":\"repossession\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00090711\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }