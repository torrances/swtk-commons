package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coeducation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00885880\"]}");
	add("{\"term\":\"coefficient\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13607325\"]}");
	add("{\"term\":\"coefficient of absorption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13607658\"]}");
	add("{\"term\":\"coefficient of concordance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06044544\"]}");
	add("{\"term\":\"coefficient of correlation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06041776\"]}");
	add("{\"term\":\"coefficient of drag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13608034\"]}");
	add("{\"term\":\"coefficient of elasticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13609166\"]}");
	add("{\"term\":\"coefficient of expansion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13609828\"]}");
	add("{\"term\":\"coefficient of friction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13608233\"]}");
	add("{\"term\":\"coefficient of mutual induction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13608439\"]}");
	add("{\"term\":\"coefficient of reflection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13610022\"]}");
	add("{\"term\":\"coefficient of self induction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13608728\"]}");
	add("{\"term\":\"coefficient of viscosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13610343\"]}");
	add("{\"term\":\"coelacanth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02518344\"]}");
	add("{\"term\":\"coelenterata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01911752\"]}");
	add("{\"term\":\"coelenterate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01912063\"]}");
	add("{\"term\":\"coelenterate family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01910928\"]}");
	add("{\"term\":\"coelenterate genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01911056\"]}");
	add("{\"term\":\"coelenteron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01908184\"]}");
	add("{\"term\":\"coeliac plexus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05516386\"]}");
	add("{\"term\":\"coeloglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12072522\"]}");
	add("{\"term\":\"coeloglossum bracteatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12072736\"]}");
	add("{\"term\":\"coeloglossum viride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12072916\"]}");
	add("{\"term\":\"coelogyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12073256\"]}");
	add("{\"term\":\"coelom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05614556\"]}");
	add("{\"term\":\"coelophysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01715811\"]}");
	add("{\"term\":\"coelostat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03066801\"]}");
	add("{\"term\":\"coenobite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10538884\"]}");
	add("{\"term\":\"coenzyme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14824447\"]}");
	add("{\"term\":\"coenzyme a\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14824709\"]}");
	add("{\"term\":\"coenzyme q\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15107457\"]}");
	add("{\"term\":\"coercion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00157632\", \"01129566\"]}");
	add("{\"term\":\"coereba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01541777\"]}");
	add("{\"term\":\"coerebidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01541416\"]}");
	add("{\"term\":\"coeval\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09979896\"]}");
	add("{\"term\":\"coevals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08386333\"]}");
	add("{\"term\":\"coexistence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13980554\"]}");
	add("{\"term\":\"coextension\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05141013\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }