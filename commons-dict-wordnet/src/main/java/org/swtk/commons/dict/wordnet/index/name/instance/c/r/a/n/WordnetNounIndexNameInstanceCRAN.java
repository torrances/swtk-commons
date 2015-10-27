package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13637969\"]}");
	add("{\"term\":\"cranberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07759878\", \"12266212\"]}");
	add("{\"term\":\"crane\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02015503\", \"03131358\", \"09318361\", \"10934083\", \"10934199\"]}");
	add("{\"term\":\"cranesbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12706592\"]}");
	add("{\"term\":\"crangon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01989322\"]}");
	add("{\"term\":\"crangonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01989179\"]}");
	add("{\"term\":\"craniata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01473711\"]}");
	add("{\"term\":\"craniate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01474323\"]}");
	add("{\"term\":\"craniologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10447231\"]}");
	add("{\"term\":\"craniology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06051336\"]}");
	add("{\"term\":\"craniometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03131578\"]}");
	add("{\"term\":\"craniometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06156759\"]}");
	add("{\"term\":\"craniotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00669979\"]}");
	add("{\"term\":\"cranium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548146\"]}");
	add("{\"term\":\"crank\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03131675\", \"03759824\", \"09994026\", \"10167825\"]}");
	add("{\"term\":\"crankcase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03131854\"]}");
	add("{\"term\":\"crankiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04649226\"]}");
	add("{\"term\":\"crankshaft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03132059\"]}");
	add("{\"term\":\"cranny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09282010\", \"13930286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }