package org.swtk.commons.dict.wiktionary.generated.z.e.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZEU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zeugma", "{\"term\":\"zeugma\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ζεῦγμα\u0027 (yoking; a bond, a band) from \u0027ζεύγνυμι\u0027 (to yoke; to join) from \u0027ζεῦγος\u0027 (a yoke)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of using a word, particularly an adjective or verb, to apply to more than one noun when its sense is appropriate to only one\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Syllepsis\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1963\u0027\u0027 July, Fred Sommers, \u0027Types and Ontology\u0027, in \u0027w:The Philosophical The Philosophical Review\u0027, Volume LXXII, Bobbs-Merrill Reprint Series in Philosophy, zeugmas%22\u0026amp;hl\u003den\u0026amp;ei\u003dpZU6Ts7FKufvmAXj18TABw\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d7\u0026amp;ved\u003d0CEQQ6AEwBjg\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"zeugmas%22\u0026amp;f\u003dfalse page 343\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The existence of \u0027\u0027zeugmas\u0027\u0027 \u0027suggests\u0027 the rule of transitivity. \u0027\u0027Zeugmas\u0027\u0027 appear incorrect because they embody an allegedly univocal use of a term in a way which violated the rule of transitivity\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, Amanda Holton, \u0027The Sources of Chaucer\u0027s Poetics\u0027, zeugmas%22\u0026amp;hl\u003den\u0026amp;ei\u003dfaE6TqXwH8HxrQfol_T2Dw\u0026amp;sa\u003dX\u0026amp;oi\u003dbook_result\u0026amp;ct\u003dresult\u0026amp;resnum\u003d1\u0026amp;ved\u003d0CCcQ6AEwADg\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"zeugmas%22\u0026amp;f\u003dfalse page 104\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Thus I would describe \u0027He took his leave and the wrong umbrella\u0027 as \u0027\u0027zeugma\u0027\u0027, but not \u0027He took his hat and umbrella\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Zeugma\u0027\u0027 is an important element in Chaucer\u0027s poetic technique, not because he uses it, but because he so regularly turns it down\", \"priority\":9}]}, \"synonyms\":{}}");

	add("zeugmatography", "{\"term\":\"zeugmatography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A former proposed term for magnetic resonance imaging\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }