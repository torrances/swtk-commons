package org.swtk.commons.dict.wiktionary.generated.m.u.g;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mugful", "{\"term\":\"mugful\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|mug|ful|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"as much as a mug will contain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mugginess", "{\"term\":\"mugginess\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being muggy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mugging", "{\"term\":\"mugging\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A quick violent robbery of a person, usually in a public place\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"There have been three \u0027\u0027muggings\u0027\u0027 in this street in the past week\", \"priority\":2}]}, \"synonyms\":{}}");

	add("muggle", "{\"term\":\"muggle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Coined by w:J. K. Rowling|J.\u0026amp;nbsp;K. Rowling.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A non-magical person\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Kirkus Reviews, review of Charlotte Haptie, \u0027Otto and the Bird Charmers\u0027, from Dow Jones, Apr 1, 200\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Once again, THE magic-working Karmidee, marginalized by THE \u0027\u0027Muggle\u0027\u0027-ish Normals, are threatened by a coup in THE city\u0027s government\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Jeffrey Weiss, review of Christine Wicker, \u0027Not in Kansas Anymore\u0027, in \u0027Dallas Morning News\u0027, Sep 30, 200\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;It could all be deadly earnest if she didn\u0027t have a sense of humor. My favorite sentence is a chapter title: \u0026quot;Every time you hear a bell, a \u0027\u0027Muggle\u0027\u0027 has turned magical.\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Felix Cheong, \u0026quot;Age-old sexism still pervades films about witches and wizards\u0026quot;, \u0027Channel News Asia\u0027, Aug 19, 200\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"In her second outing as a witch — the first being \u0027Practical Magic\u0027 (1998) — Nicole Kidman plays Isabel, a witch who\u0027s trying to settle down to the \u0027\u0027Muggle\u0027\u0027 life of a suburban housewife\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A non-specialist; someone lacking a particular skill or ability\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, \u0026quot;There are too many flashing lights nowadays for a knight of the road...\u0026quot;, in \u0027Nursing Standard\u0027, May 14, 200\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"…] I have finally worked out that the word ECNALUBMA in back-to-front writing translates as \u0027get out of my way, you \u0027\u0027Muggle\u0027\u0027 motorist\", \"priority\":10}]}, \"synonyms\":{}}");

	add("mugwort", "{\"term\":\"mugwort\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) \u0027mucgwyrt\u0027 \u0027\u0027 et al., from Proto-germanic probably corresponding to {{compound|midge|wort|lang\u003den}}. Cognate with regional Low German \u0027muggart\u0027 \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several aromatic plants of the genus \u0027Artemisia\u0027 native to Europe and Asia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Artemisia vulgaris\u0027, traditionally used medicinally\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1653\u0027\u0027, \u0027The English Physician Enlarged\u0027, Folio Society 2007, p. 197\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Mugwort\u0027\u0027 is with good success put among other herbs that are boiled, for women to sit over the hot decoction to draw down their courses, to help the delivery of the birth and expel the afterbirth, as also for the obstructions and inflammations of the mother\", \"priority\":4}]}, \"synonyms\":{}}");

	add("mugwumpery", "{\"term\":\"mugwumpery\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|mugwump|ery|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The acts and views of the mugwumps\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mugwumpism", "{\"term\":\"mugwumpism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|mugwump|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The acts and views of the mugwumps\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }