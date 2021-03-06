package org.swtk.commons.dict.wiktionary.generated.u.r.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryURO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("urobilin", "{\"term\":\"urobilin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A yellow linear tetrapyrrole resulting from the breakdown of heme, produced when urobilinogen is oxidized by intestinal bacteria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urocyst", "{\"term\":\"urocyst\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|uro|cyst|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The urinary bladder\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uroflowmetry", "{\"term\":\"uroflowmetry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"measurement of the flow of urine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urography", "{\"term\":\"urography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|uro|graphy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"radiography of the urinary tract\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urology", "{\"term\":\"urology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|uro|logy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The surgical specialty of medicine that treats disorders of the urinary tract and the urogenital system\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uropathy", "{\"term\":\"uropathy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|uro|pathy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any disease or disorder of the urinary tract\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The therapeutic use of urine; urine therapy\", \"priority\":2}]}, \"synonyms\":{}}");

	add("urophile", "{\"term\":\"urophile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|uro|phile|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One with a sexual dependency on the smell and/or taste of urine or the sight and sound of someone urinating\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urophilia", "{\"term\":\"urophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|uro|philia|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Undinism, a fetish for or sexual dependency on either the smell and/or taste of urine, or the sight and sound of someone urinating\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uropygium", "{\"term\":\"uropygium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Mediaeval Latin, from Ancient greek (to 1453) \u0027οὐροπύγιον\u0027 (tail feathers)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The posterior part of a bird\u0027s body from which the tailfeathers grow\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urosepsis", "{\"term\":\"urosepsis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"sepsis caused by bacteria from the urinary tract invading the bloodstream\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urostomy", "{\"term\":\"urostomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|uro|stomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a surgically constructed opening in the urinary tract allowing urine to exit the body; the procedure of making such an opening\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urotropine", "{\"term\":\"urotropine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"hexamine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }